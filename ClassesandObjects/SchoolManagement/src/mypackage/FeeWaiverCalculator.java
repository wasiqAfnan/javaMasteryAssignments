/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

/**
 *
 * @author Afnan's Laptop
 */
public class FeeWaiverCalculator {
     public static String calculateWaiver(int income) {
        if (income <= 250000) {
            return "100% Fee Waiver";
        } else if (income <= 500000) {
            return "50% Fee Waiver";
        } else {
            return "No Fee Waiver";
        }
    }
}
