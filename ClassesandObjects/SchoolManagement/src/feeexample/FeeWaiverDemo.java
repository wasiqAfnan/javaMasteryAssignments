/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package feeexample;
import mypackage.FeeWaiverCalculator;
import java.util.Scanner;

/**
 *
 * @author Afnan's Laptop
 */
public class FeeWaiverDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter family income (₹): ");
        int income = scanner.nextInt();

        String waiver = FeeWaiverCalculator.calculateWaiver(income);
        System.out.println("Fee Waiver Status: " + waiver);

        scanner.close();
    }
    
}
