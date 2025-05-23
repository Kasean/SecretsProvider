package org.kasean.api.controllers;

import org.kasean.api.models.CreateSecretRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/v1")
public interface SecretController {

    @PostMapping("/createSecret")
    String createSecret(Model model, @RequestParam(value = "request") CreateSecretRequest request);

    @GetMapping("/createSecret")
    String createSecret(Model model);

    @GetMapping("/showSecret/{id}")
    String showSecret(Model model, @PathVariable String id);

}
