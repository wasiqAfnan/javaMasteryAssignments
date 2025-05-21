package main;

import encryption.Encryptor;
import encryption.Decryptor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filename = "secret.txt";
        int shift = 3; // Caesar cipher shift
        String textToEncrypt = "Hello World! Caesar Cipher Works.";

        Encryptor encryptor = new Encryptor();
        Decryptor decryptor = new Decryptor();

        // Encrypt and save to file
        encryptor.encryptToFile(textToEncrypt, shift, filename);
        System.out.println("Original Text   : " + textToEncrypt);

        // Read and display encrypted text from file
        String encryptedText = readFromFile(filename);
        System.out.println("Encrypted Text  : " + encryptedText);

        // Decrypt from file and display
        String decryptedText = decryptor.decryptFromFile(shift, filename);
        System.out.println("Decrypted Text  : " + decryptedText);
    }

    // Utility method to read file content
    private static String readFromFile(String filename) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                content.append((char) ch);
            }
        } catch (IOException e) {
            System.out.println("Error reading encrypted text: " + e.getMessage());
        }
        return content.toString();
    }
}
