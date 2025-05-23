package org.kasean.api.controllers;

import org.kasean.api.models.CreateSecretRequest;
import org.kasean.services.SecretService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

@Component
public class SecretControllerImpl implements SecretController{

    private static final Logger LOGGER = LoggerFactory.getLogger("SecretController");

    private final SecretService secretService;

    public SecretControllerImpl(SecretService secretService) {
        this.secretService = secretService;
    }

    @Override
    public String createSecret(Model model, CreateSecretRequest request) {
        model.addAttribute("link", secretService.createSecret(request.getMessage()));
        return "createSecret";
    }

    @Override
    public String createSecret(Model model) {
        return "createSecret";
    }

    @Override
    public String showSecret(Model model, String id) {
        model.addAttribute("secret", secretService.getSecret(id));
        return "showSecret";
    }
}
