/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package producerconsumerinventory;


import warehouse.InventoryBuffer;
import warehouse.Producer;
import warehouse.Consumer;

public class InventoryManagementDemo {
    public static void main(String[] args) {
        InventoryBuffer buffer = new InventoryBuffer(5); // buffer can hold up to 5 items

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Inventory processing complete.");
    }
}

