/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

/**
 *
 * @author Afnan's Laptop
 */
public class Student extends Person {
    protected int roll;
    protected String regNumber;

    // Constructor for Student
    public Student(String name, String aadharNumber, int roll, String regNumber) {
        super(name, aadharNumber);
        this.roll = roll;
        this.regNumber = regNumber;
    }

    // Overriding the display method
    @Override
    public void display() {
        super.display();
        System.out.println("Roll Number: " + roll);
        System.out.println("Registration Number: " + regNumber);
    }
}