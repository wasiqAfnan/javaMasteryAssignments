/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

public class Borrower {
    private int id;
    private String name;
    private String bookTitle;

    public Borrower(int id, String name, String bookTitle) {
        this.id = id;
        this.name = name;
        this.bookTitle = bookTitle;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Book: " + bookTitle;
    }
}
