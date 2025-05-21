/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encryption;

import java.io.*;

public class Decryptor {

    public String decryptFromFile(int shift, String filename) {
        StringBuilder decrypted = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                char c = (char) ch;
                if (Character.isLetter(c)) {
                    char base = Character.isLowerCase(c) ? 'a' : 'A';
                    c = (char) ((c - base - shift + 26) % 26 + base);
                }
                decrypted.append(c);
            }
        } catch (IOException e) {
            System.out.println("Error reading or decrypting file: " + e.getMessage());
        }
        return decrypted.toString();
    }
}

