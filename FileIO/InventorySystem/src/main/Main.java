/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import inventory.Product;
import inventory.ProductWriter;
import inventory.ProductSearcher;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductWriter writer = new ProductWriter();
        ProductSearcher searcher = new ProductSearcher();
        String filename = "src/Files/products.txt";

        System.out.print("Enter number of products to add: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            Product product = new Product(id, name, quantity, price);
            writer.appendProductToFile(product, filename);
        }

        System.out.print("\nEnter Product ID to search: ");
        int searchId = sc.nextInt();
        Product found = searcher.searchProductById(filename, searchId);

        if (found != null) {
            System.out.println("Product found: " + found);
        } else {
            System.out.println("Product with ID " + searchId + " not found.");
        }
    }
}

