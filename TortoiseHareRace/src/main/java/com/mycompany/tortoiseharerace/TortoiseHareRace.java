/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tortoiseharerace;


import mypackage.*;

/**
 *
 * @author Subhranil
 */

public class TortoiseHareRace {

    public static void main(String[] args) throws InterruptedException {
        Racer tortoise = new Tortoise();
        Racer hare = new Hare();

        Thread tortoiseThread = new Thread(tortoise);
        Thread hareThread = new Thread(hare);

        System.out.println("---------- The race begins ----------");

        tortoiseThread.start();
        hareThread.start();
        tortoiseThread.join();
        hareThread.join();

        if (tortoise.hasFinished() && hare.hasFinished()) {
            System.out.println("Draw!");
        } else if (tortoise.hasFinished()) {
            System.out.println("Tortoise wins the race!");
        } else if (hare.hasFinished()) {
            System.out.println("Hare wins the race!");
        }

        System.out.println("---------- Game Over ----------");
    }
}
