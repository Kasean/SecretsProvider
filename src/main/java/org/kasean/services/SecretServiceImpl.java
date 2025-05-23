package org.kasean.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class SecretServiceImpl implements SecretService {

    private static final Logger LOGGER = LoggerFactory.getLogger("SecretService");

    private final EncryptionService encoder;
    private final ConcurrentHashMap<String, String> messageKeeper = new ConcurrentHashMap<>();

    public SecretServiceImpl(EncryptionService encoder) {
        this.encoder = encoder;
    }

    @Override
    public String createSecret(String rawSecretMessage) {
        var rawKey = UUID.randomUUID();
        var savedSecret = encoder.encrypt(rawSecretMessage);

        saveData(rawKey.toString(), savedSecret);
        return "localhost:8080/api/v1/showSecret/" + rawKey;
    }

    private void saveData(String key, String value) {
        messageKeeper.put(key, value);
    }

    @Override
    public String getSecret(String key) {
        var secret = messageKeeper.get(key);
        if (secret != null) {
            var result = encoder.decrypt(secret);
            messageKeeper.remove(key);
            if (LOGGER.isDebugEnabled())
                LOGGER.debug("Secret for key {} founded and deleted.", key);

            return result;
        }

        LOGGER.info("Cannot find secret for key: {}", key);

        return "Sorry, this secret unavailable (already viewed or newer exists).";
    }
}
