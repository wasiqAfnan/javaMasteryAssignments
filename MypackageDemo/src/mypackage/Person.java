/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

/**
 *
 * @author Afnan's Laptop
 */
public class Person {
     protected String name;
    protected String aadharNumber;

    // Default Constructor
    public Person() {
        this.name = "Unknown";
        this.aadharNumber = "0000-0000-0000";
    }

    // Parameterized Constructor
    public Person(String name, String aadharNumber) {
        this.name = name;
        this.aadharNumber = aadharNumber;
    }

    // Display Method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadharNumber);
    }
}
