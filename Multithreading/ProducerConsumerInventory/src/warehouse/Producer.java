/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warehouse;

public class Producer extends Thread {
    private final InventoryBuffer buffer;

    public Producer(InventoryBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int itemId = 1;
        try {
            while (itemId <= 10) {
                String item = "Item-" + itemId++;
                buffer.produce(item);
                Thread.sleep(500); // simulate production time
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

