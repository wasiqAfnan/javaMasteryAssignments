/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import library.Borrower;
import library.BorrowerWriter;
import library.BorrowerReader;

public class Main {
    public static void main(String[] args) {
        String filename = "src/Files/borrowers.txt";

        BorrowerWriter writer = new BorrowerWriter();
        BorrowerReader reader = new BorrowerReader();

        // Sample entries
        writer.addBorrowerToFile(new Borrower(1, "Rohan", "The Hobbit"), filename);
        writer.addBorrowerToFile(new Borrower(2, "Faraz", "1984"), filename);

        // Display all borrowers
        reader.displayBorrowers(filename);
    }
}

