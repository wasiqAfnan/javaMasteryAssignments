/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insuranceapp;
import mypackage.PremiumCalculator;
import java.util.Scanner;

/**
 *
 * @author Afnan's Laptop
 */
public class InsuranceDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        PremiumCalculator.calculatePremium(age);

        scanner.close();
    }
    
}
