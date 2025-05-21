/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;
public class Product {
    int productId;
    String productName;
    int stock;

    public Product(int productId, String productName, int stock) {
        this.productId = productId;
        this.productName = productName;
        this.stock = stock;
    }
    
    public void purchase(int stock) throws OutOfStockException {
        if (this.stock < stock) {
            throw new OutOfStockException("Out Of Stock");
        }
        
        this.stock = this.stock - stock;
    }

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", productName=" + productName + ", stock=" + stock + '}';
    }
}
