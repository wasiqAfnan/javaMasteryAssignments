/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

/**
 *
 * @author Afnan's Laptop
 */
// Subclass BorrowedBook implementing Borrowable interface
public class BorrowedBook extends Book implements Borrowable {
    private boolean isBorrowed;

    public BorrowedBook(String title, String author, double price) {
        super(title, author, price);
        this.isBorrowed = false;
    }

    @Override
    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("Book '" + getTitle() + "' has been borrowed.");
        } else {
            System.out.println("Book '" + getTitle() + "' is already borrowed.");
        }
    }

    @Override
    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Book '" + getTitle() + "' has been returned.");
        } else {
            System.out.println("Book '" + getTitle() + "' was not borrowed.");
        }
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Status: " + (isBorrowed ? "Borrowed" : "Available"));
    }
}
