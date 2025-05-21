/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

/**
 *
 * @author Subhranil
 */

public class Tortoise extends Racer implements Runnable {
    public Tortoise() {
        super("Tortoise");
    }

    @Override
    protected void move() {
        position += 1;
        System.out.println(name + " is at position " + position);
    }
}
