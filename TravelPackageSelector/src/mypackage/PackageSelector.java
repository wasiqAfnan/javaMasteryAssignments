/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

/**
 *
 * @author Afnan's Laptop
 */
public class PackageSelector {
    public static void suggestPackage(int budget) {
        if (budget <= 10000) {
            System.out.println("Budget: ₹" + budget + " - Suggested Package: Local");
        } else if (budget <= 50000) {
            System.out.println("Budget: ₹" + budget + " - Suggested Package: Domestic");
        } else {
            System.out.println("Budget: ₹" + budget + " - Suggested Package: International");
        }
    }
}
