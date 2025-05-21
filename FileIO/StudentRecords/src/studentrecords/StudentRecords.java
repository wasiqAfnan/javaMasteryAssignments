/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentrecords;

import student.Student;
import student.StudentWriter;
import student.StudentReader;

import java.util.*;

public class StudentRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentWriter writer = new StudentWriter();
        StudentReader reader = new StudentReader();
        String filename = "src/Files/students.txt";

        System.out.print("Enter number of students to add: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            Student student = new Student(id, name, marks);
            writer.writeStudentToFile(student, filename);
        }

        System.out.println("\nStudent records from file:");
        List<Student> students = reader.readStudentsFromFile(filename);
        for (Student s : students) {
            System.out.println(s);
        }
    }
}


