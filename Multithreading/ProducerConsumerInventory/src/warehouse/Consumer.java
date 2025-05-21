/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warehouse;

public class Consumer extends Thread {
    private final InventoryBuffer buffer;

    public Consumer(InventoryBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            int consumedCount = 0;
            while (consumedCount < 10) {
                buffer.consume();
                consumedCount++;
                Thread.sleep(800); // simulate consumption time
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

