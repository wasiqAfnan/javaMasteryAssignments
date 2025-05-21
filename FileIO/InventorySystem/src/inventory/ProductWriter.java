/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory;

import java.io.*;

public class ProductWriter {

    public void appendProductToFile(Product product, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(product.getId() + "," + product.getName() + "," + product.getQuantity() + "," + product.getPrice());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error writing product to file: " + e.getMessage());
        }
    }
}


