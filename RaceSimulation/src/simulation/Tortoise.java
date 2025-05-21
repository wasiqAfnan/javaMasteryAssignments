/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulation;

/**
 *
 * @author Afnan's Laptop
 */
public class Tortoise implements Runnable {
    private RaceController controller;
    private int position = 0;
    
    public Tortoise(RaceController controller) {
        this.controller = controller;
    }
    
    @Override
    public void run() {
        while (controller.isRaceInProgress()) {
            // Move tortoise forward
            position += controller.getTortoiseStep();
            
            // Update position in controller
            controller.updateTortoisePosition(position);
            
            // Sleep for the tortoise's move interval
            try {
                Thread.sleep(controller.getTortoiseSleepTime());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
