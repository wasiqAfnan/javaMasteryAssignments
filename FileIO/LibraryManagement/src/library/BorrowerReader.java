/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import java.io.*;

public class BorrowerReader {

    public void displayBorrowers(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("\n--- Borrower History ---");
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", 3);
                if (parts.length == 3) {
                    System.out.println("ID: " + parts[0] + ", Name: " + parts[1] + ", Book: " + parts[2]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Borrower file not found.");
        } catch (IOException e) {
            System.out.println("Error reading borrower file.");
        }
    }
}

