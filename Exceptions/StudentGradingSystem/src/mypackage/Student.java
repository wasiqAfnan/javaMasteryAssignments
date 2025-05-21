/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

public class Student {
    private String name;
    private int rollNumber;
    private int[] marks; // Marks for 3 subjects

    public Student(String name, int rollNumber, int[] marks) throws InvalidMarksException {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = new int[3];
        for (int i = 0; i < 3; i++) {
            if (marks[i] < 0 || marks[i] > 100) {
                throw new InvalidMarksException("Invalid marks for subject " + (i + 1) + ": " + marks[i]);
            }
            this.marks[i] = marks[i];
        }
    }

    public int calculateTotal() {
        return marks[0] + marks[1] + marks[2];
    }

    public double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    public String calculateGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return "A+";
        else if (avg >= 75) return "A";
        else if (avg >= 60) return "B";
        else if (avg >= 40) return "C";
        else return "F";
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nRoll Number: " + rollNumber +
               "\nTotal Marks: " + calculateTotal() +
               "\nAverage: " + calculateAverage() +
               "\nGrade: " + calculateGrade();
    }
}

