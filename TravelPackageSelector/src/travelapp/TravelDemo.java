/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package travelapp;
import mypackage.PackageSelector;
import java.util.Scanner;

/**
 *
 * @author Afnan's Laptop
 */
public class TravelDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your travel budget (₹): ");
        int budget = scanner.nextInt();

        PackageSelector.suggestPackage(budget);

        scanner.close();
    }
    
}
