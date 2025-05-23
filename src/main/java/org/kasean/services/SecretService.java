package org.kasean.services;

public interface SecretService {

    String createSecret(String rawSecretMessage);

    String getSecret(String key);
}
