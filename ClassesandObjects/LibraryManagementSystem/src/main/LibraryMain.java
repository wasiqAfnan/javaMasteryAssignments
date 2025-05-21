/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import library.Book;
import library.BorrowedBook;
import java.util.Scanner;

/**
 *
 * @author Afnan's Laptop
 */
public class LibraryMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for Book
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine();
        System.out.print("Enter Book Price: ");
        double price = scanner.nextDouble();

        BorrowedBook borrowedBook = new BorrowedBook(title, author, price);

        // Display details before borrowing
        System.out.println("\nBook Details:");
        borrowedBook.displayDetails();

        // Borrow and return book
        System.out.println("\nAttempting to borrow the book...");
        borrowedBook.borrowBook();
        borrowedBook.displayDetails();

        System.out.println("\nAttempting to return the book...");
        borrowedBook.returnBook();
        borrowedBook.displayDetails();

        scanner.close();
    }
    
}
