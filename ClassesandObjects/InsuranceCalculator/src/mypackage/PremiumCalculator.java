/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

/**
 *
 * @author Afnan's Laptop
 */
public class PremiumCalculator {
        public static void calculatePremium(int age) {
            int premium = (age <= 25) ? 5000 : 7000;
            System.out.println("Age: " + age + " - Annual Premium: ₹" + premium);
    }
}
