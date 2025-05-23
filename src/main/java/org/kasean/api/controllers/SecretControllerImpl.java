package org.kasean.api.controllers;

import org.kasean.api.models.CreateSecretRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

@Component
public class SecretControllerImpl implements SecretController{

    private static final Logger LOGGER = LoggerFactory.getLogger("SecretController");

    @Override
    public String createSecret(Model model, CreateSecretRequest request) {
        LOGGER.info("Request: {}", request.getMessage());
        model.addAttribute("link", "Link for secret: " + request.getMessage());
        return "createSecret";
    }

    @Override
    public String createSecret(Model model) {
        return "createSecret";
    }

    @Override
    public String showSecret(Model model, String id) {
        return "";
    }
}
