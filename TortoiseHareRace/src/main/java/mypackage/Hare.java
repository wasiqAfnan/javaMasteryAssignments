/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

/**
 *
 * @author Subhranil
 */

public class Hare extends Racer implements Runnable {
    public Hare() {
        super("Hare");
    }

    @Override
    protected void move() {
        if (Math.random() < 0.70) { // 70% chance of moving
            position += 3;
            System.out.println(name + " is at position " + position);
            
        } else {
            System.out.println(name + " is sleeping at position " + position);
            try {
                Thread.sleep(400); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
