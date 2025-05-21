/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulation;
import java.util.Random;


/**
 *
 * @author Afnan's Laptop
 */

import java.util.Random;

public class Hare implements Runnable {
    private RaceController controller;
    private int position = 0;
    private Random random = new Random();
    
    public Hare(RaceController controller) {
        this.controller = controller;
    }
    
    @Override
    public void run() {
        while (controller.isRaceInProgress()) {
            // Decide if hare will sleep (show overconfidence)
            boolean willSleep = random.nextDouble() < controller.getHareSleepProbability();
            
            if (willSleep) {
                // Hare decides to take a nap
                controller.setHareIsSleeping(true);
                controller.updateHarePosition(position); // Update to show "sleeping" status
                
                try {
                    Thread.sleep(controller.getHareNapTime());
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                
                controller.setHareIsSleeping(false);
            } else {
                // Move hare forward
                position += controller.getHareStep();
                
                // Update position in controller
                controller.updateHarePosition(position);
                
                // Sleep for the hare's normal move interval
                try {
                    Thread.sleep(controller.getHareSleepTime());
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }
}
