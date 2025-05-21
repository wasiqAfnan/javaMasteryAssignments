/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import mypackage.Person;
import mypackage.Student;

/**
 *
 * @author Afnan's Laptop
 */
public class DemoApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person("Amit Kumar", "1234-5678-9012");
        System.out.println("Person Details:");
        person.display();

        System.out.println("\n----------------------\n");

        // Creating a Student object
        Student student = new Student("Raj Verma", "9876-5432-1098", 101, "REG2025XYZ");
        System.out.println("Student Details:");
        student.display();
    }
    
}
