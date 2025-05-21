/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package groceryapp;
import mypackage.DiscountCalculator;
import java.util.Scanner;

/**
 *
 * @author Afnan's Laptop
 */
public class GroceryDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter price per item: ");
        double price = scanner.nextDouble();

        DiscountCalculator.calculateDiscount(quantity, price);

        scanner.close();
    }
    
}
