package org.kasean.services;

public interface EncryptionService {

    String encrypt(String value);

    String decrypt(String encrypted);
}
