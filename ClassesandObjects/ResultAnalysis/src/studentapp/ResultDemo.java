/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentapp;
import mypackage.ResultEvaluator;
import java.util.Scanner;
/**
 *
 * @author Afnan's Laptop
 */
public class ResultDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        int marks1 = scanner.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int marks2 = scanner.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int marks3 = scanner.nextInt();

        ResultEvaluator.evaluateResult(marks1, marks2, marks3);

        scanner.close();
    }
    
}
