/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encryption;

import java.io.*;

public class Encryptor {

    public void encryptToFile(String plainText, int shift, String filename) {
        StringBuilder encrypted = new StringBuilder();
        for (char ch : plainText.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                ch = (char) ((ch - base + shift) % 26 + base);
            }
            encrypted.append(ch);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(encrypted.toString());
        } catch (IOException e) {
            System.out.println("Error writing encrypted text: " + e.getMessage());
        }
    }
}
