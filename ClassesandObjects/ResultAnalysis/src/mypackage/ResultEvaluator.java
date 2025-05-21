/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

/**
 *
 * @author Afnan's Laptop
 */
public class ResultEvaluator {
    public static void evaluateResult(int marks1, int marks2, int marks3) {
        double average = (marks1 + marks2 + marks3) / 3.0;
        boolean passed = (marks1 >= 40 && marks2 >= 40 && marks3 >= 40) && (average >= 50);

        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Average Marks: " + average);
        System.out.println("Result: " + (passed ? "Pass" : "Fail"));
    }
}
