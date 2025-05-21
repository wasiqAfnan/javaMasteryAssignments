/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

/**
 *
 * @author Afnan's Laptop
 */
public class DiscountCalculator {
     public static void calculateDiscount(int quantity, double price) {
        double discountRate = (quantity > 50) ? 0.10 : (quantity > 10) ? 0.05 : 0.0;
        double totalPrice = quantity * price;
        double discountAmount = totalPrice * discountRate;
        double finalPrice = totalPrice - discountAmount;

        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: ₹" + totalPrice);
        System.out.println("Discount: ₹" + discountAmount);
        System.out.println("Final Price after Discount: ₹" + finalPrice);
    }
}
