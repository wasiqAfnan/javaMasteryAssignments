/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulation;

/**
 *
 * @author Afnan's Laptop
 */
public class RaceStatus {
    private volatile int tortoisePosition = 0;
    private volatile int harePosition = 0;
    private volatile boolean raceOver = false;

    public synchronized void updateTortoise(int position) {
        tortoisePosition = position;
    }

    public synchronized void updateHare(int position) {
        harePosition = position;
    }

    public synchronized int getTortoisePosition() {
        return tortoisePosition;
    }

    public synchronized int getHarePosition() {
        return harePosition;
    }

    public synchronized boolean isRaceOver() {
        return raceOver;
    }

    public synchronized void endRace() {
        raceOver = true;
    }
}
