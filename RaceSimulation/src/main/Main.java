/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import simulation.RaceController;

/**
 *
 * @author Afnan's Laptop
 */

public class Main {
    // Race configuration constants
    private static final int TRACK_LENGTH = 100;
    private static final int TORTOISE_STEP = 1;
    private static final int HARE_STEP = 3;
    private static final long TORTOISE_SLEEP_TIME = 100; // milliseconds
    private static final long HARE_SLEEP_TIME = 100; // normal movement sleep
    private static final long HARE_NAP_TIME = 400; // sleeping due to overconfidence
    private static final double HARE_SLEEP_PROBABILITY = 0.4; // 20% chance to nap

    public static void main(String[] args) {
        System.out.println("Starting the Tortoise and Hare Race Simulation!");
        System.out.println("Track length: " + TRACK_LENGTH + " units");
        System.out.println("---------------------------------------------");
        
        // Create and start the race controller
        RaceController controller = new RaceController(
            TRACK_LENGTH, 
            TORTOISE_STEP, TORTOISE_SLEEP_TIME,
            HARE_STEP, HARE_SLEEP_TIME, HARE_NAP_TIME, HARE_SLEEP_PROBABILITY
        );
        
        controller.startRace();
        
        // Main thread waits for a brief moment to ensure all output is finished
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        System.out.println("\nRace simulation complete!");
    }
}
