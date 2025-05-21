/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import mypackage.Teacher;
import mypackage.MathTeacher;
import java.util.Scanner;

/**
 *
 * @author Afnan's Laptop
 */
public class TeacherDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter Teacher Name: ");
        String teacherName = scanner.nextLine();

        System.out.print("Enter College Name: ");
        String collegeName = scanner.nextLine();

        System.out.print("Enter Subject of Interest: ");
        String subject = scanner.nextLine();

        // Assigning Child Object to Base Class Reference
        Teacher teacherRef = new MathTeacher(teacherName, collegeName, subject);
        
        System.out.println("\nTeacher Details:");
        teacherRef.display();

        scanner.close();
    }
    
}
