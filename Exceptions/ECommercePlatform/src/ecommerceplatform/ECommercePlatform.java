/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecommerceplatform;

import mypackage.Product;

public class ECommercePlatform {

     public static void main(String[] args) {
        Product p = new Product(0011, "AC", 1);
        System.out.println(p);
        try {
            p.purchase(1);
            System.out.println(p);
            p.purchase(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
