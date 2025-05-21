/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template*/
package warehouse;

import java.util.ArrayList;
import java.util.List;

public class InventoryBuffer {
    private final List<String> buffer = new ArrayList<>();
    private final int capacity;

    public InventoryBuffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(String item) throws InterruptedException {
        while (buffer.size() >= capacity) {
            System.out.println("Producer waiting: Inventory full");
            wait();
        }
        buffer.add(item);
        System.out.println("Produced: " + item);
        notify(); // notify the consumer
    }

    public synchronized String consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("Consumer waiting: Inventory empty");
            wait();
        }
        String item = buffer.remove(0);
        System.out.println("Consumed: " + item);
        notify(); // notify the producer
        return item;
    }
}

