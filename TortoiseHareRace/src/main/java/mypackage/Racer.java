/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

/**
 *
 * @author Subhranil
 */

public abstract class Racer implements Runnable {
    protected int position = 0;
    private final int finishLine = 100;
    public String name;
    private volatile static boolean raceFinished = false;

    public Racer(String name) {
        this.name = name;
    }

    public boolean hasFinished() {
        return position >= finishLine;
    }

    protected abstract void move();

    @Override
    public void run() {
        while (!raceFinished && !hasFinished()) {
            move();

            if (hasFinished()) {
                raceFinished = true;
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}
