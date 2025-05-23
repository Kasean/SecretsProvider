package org.kasean.api.models;

public class CreateSecretRequest {
    private String message;

    public CreateSecretRequest(String message) {
        this.message = message;
    }

    public CreateSecretRequest() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
