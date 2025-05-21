/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

/**
 *
 * @author Afnan's Laptop
 */
public class Teacher {
    private String name;
    private String collegeName;

    // Default Constructor
    public Teacher() {
        this.name = "Unknown";
        this.collegeName = "Not Assigned";
    }

    // Parameterized Constructor
    public Teacher(String name, String collegeName) {
        this.name = name;
        this.collegeName = collegeName;
    }

    // Display Method
    public void display() {
        System.out.println("Teacher Name: " + name);
        System.out.println("College Name: " + collegeName);
    }
}
