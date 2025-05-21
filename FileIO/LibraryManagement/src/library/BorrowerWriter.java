/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import java.io.*;

public class BorrowerWriter {

    public void addBorrowerToFile(Borrower borrower, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(borrower.getId() + "," + borrower.getName() + "," + borrower.getBookTitle());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error writing borrower to file: " + e.getMessage());
        }
    }
}

