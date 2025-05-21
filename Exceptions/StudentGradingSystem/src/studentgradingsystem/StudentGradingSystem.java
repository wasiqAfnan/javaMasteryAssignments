/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentgradingsystem;

import java.util.Scanner;
import mypackage.Student;
import mypackage.InvalidMarksException;

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();

            int[] marks = new int[3];
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
            }

            Student student = new Student(name, roll, marks);
            System.out.println("\n--- Student Result ---");
            System.out.println(student);

        } catch (InvalidMarksException e) {
            System.out.println(e.toString());
        } catch (Exception ex) {
            System.out.println("Unexpected error occurred.");
        } finally {
            sc.close();
        }
    }
}

