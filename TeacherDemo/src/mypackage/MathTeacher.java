/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

/**
 *
 * @author Afnan's Laptop
 */
public class MathTeacher extends Teacher {
    private String subjectOfInterest;

    // Constructor for MathTeacher
    public MathTeacher(String name, String collegeName, String subjectOfInterest) {
        super(name, collegeName);
        this.subjectOfInterest = subjectOfInterest;
    }

    // Overriding the display method
    @Override
    public void display() {
        super.display();
        System.out.println("Subject of Interest: " + subjectOfInterest);
    }
}
