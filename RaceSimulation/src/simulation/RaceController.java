/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulation;

/**
 *
 * @author Afnan's Laptop
 */
public class RaceController {
    private int trackLength;
    
    // Tortoise configuration
    private int tortoiseStep;
    private long tortoiseSleepTime;
    
    // Hare configuration
    private int hareStep;
    private long hareSleepTime;
    private long hareNapTime;
    private double hareSleepProbability;
    
    // Race state
    private volatile int tortoisePosition = 0;
    private volatile int harePosition = 0;
    private volatile boolean raceInProgress = true;
    private volatile boolean hareIsSleeping = false;
    
    // Thread handles
    private Thread tortoiseThread;
    private Thread hareThread;
    
    public RaceController(int trackLength, 
                          int tortoiseStep, long tortoiseSleepTime,
                          int hareStep, long hareSleepTime, 
                          long hareNapTime, double hareSleepProbability) {
        this.trackLength = trackLength;
        this.tortoiseStep = tortoiseStep;
        this.tortoiseSleepTime = tortoiseSleepTime;
        this.hareStep = hareStep;
        this.hareSleepTime = hareSleepTime;
        this.hareNapTime = hareNapTime;
        this.hareSleepProbability = hareSleepProbability;
    }
    
    public void startRace() {
        // Create the runnables
        Tortoise tortoiseRunnable = new Tortoise(this);
        Hare hareRunnable = new Hare(this);
        
        // Create and start the threads
        tortoiseThread = new Thread(tortoiseRunnable, "Tortoise");
        hareThread = new Thread(hareRunnable, "Hare");
        
        tortoiseThread.start();
        hareThread.start();
        
        // Wait for both threads to complete
        try {
            tortoiseThread.join();
            hareThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Race interrupted!");
        }
    }
    
    // Getters for race configuration
    public int getTrackLength() {
        return trackLength;
    }
    
    public int getTortoiseStep() {
        return tortoiseStep;
    }
    
    public long getTortoiseSleepTime() {
        return tortoiseSleepTime;
    }
    
    public int getHareStep() {
        return hareStep;
    }
    
    public long getHareSleepTime() {
        return hareSleepTime;
    }
    
    public long getHareNapTime() {
        return hareNapTime;
    }
    
    public double getHareSleepProbability() {
        return hareSleepProbability;
    }
    
    // Race state methods
    public boolean isRaceInProgress() {
        return raceInProgress;
    }
    
    public void setHareIsSleeping(boolean sleeping) {
        this.hareIsSleeping = sleeping;
    }
    
    public boolean isHareSleeping() {
        return hareIsSleeping;
    }
    
    // Synchronized methods for updating positions
    public synchronized void updateTortoisePosition(int newPosition) {
        if (raceInProgress) {
            tortoisePosition = Math.min(newPosition, trackLength);
            printRaceStatus();
            checkWinner();
        }
    }
    
    public synchronized void updateHarePosition(int newPosition) {
        if (raceInProgress) {
            harePosition = Math.min(newPosition, trackLength);
            printRaceStatus();
            checkWinner();
        }
    }
    
    // Check if we have a winner
    private synchronized void checkWinner() {
        boolean tortoiseWon = tortoisePosition >= trackLength;
        boolean hareWon = harePosition >= trackLength;
        
        if (tortoiseWon || hareWon) {
            raceInProgress = false;
            
            // Small delay to allow final race status to be visible
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            
            announceWinner(tortoiseWon, hareWon);
        }
    }
    
    // Print race status with ASCII art
    private synchronized void printRaceStatus() {
        // Clear screen (optional, works in some terminals)
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        // Print header
        System.out.println("TORTOISE AND HARE RACE SIMULATION");
        System.out.println("=================================");
        
        // Create the track visualization
        StringBuilder track = new StringBuilder();
        StringBuilder positions = new StringBuilder();
        
        // Add position markers
        positions.append("Position: ");
        track.append("          ");
        
        for (int i = 0; i <= 100; i += 10) {
            String marker = String.format("%-10d", i);
            positions.append(marker);
            track.append("|         ");
        }
        
        System.out.println(positions.toString());
        System.out.println(track.toString());
        
        // Create a character array for the track with racers
        char[] raceTrack = new char[trackLength + 1];
        for (int i = 0; i <= trackLength; i++) {
            raceTrack[i] = ' ';
        }
        
        // Mark the tortoise position
        if (tortoisePosition <= trackLength) {
            raceTrack[tortoisePosition] = 'T';
        }
        
        // Mark the hare position (handle possible overlap with tortoise)
        if (harePosition <= trackLength) {
            if (harePosition == tortoisePosition) {
                raceTrack[harePosition] = 'B'; // Both at same position
            } else {
                raceTrack[harePosition] = 'H';
            }
        }
        
        // Create the visualization strings
        StringBuilder tortoiseLine = new StringBuilder("Tortoise: ");
        StringBuilder hareLine = new StringBuilder("Hare:     ");
        
        // Build the track visualization
        for (int i = 0; i <= trackLength; i++) {
            if (i == tortoisePosition) {
                tortoiseLine.append("T");
            } else {
                tortoiseLine.append(" ");
            }
            
            if (i == harePosition) {
                hareLine.append("H");
            } else {
                hareLine.append(" ");
            }
        }
        
        System.out.println("\nRacers:");
        System.out.println(tortoiseLine.toString());
        String hareStatus = hareLine.toString();
        if (hareIsSleeping) {
            hareStatus += " [SLEEPING! Zzz...]";
        }
        System.out.println(hareStatus);
        
        // Print legend for position markers
        System.out.println("\nLegend: T = Tortoise, H = Hare, B = Both at same position");
        
        // Print current positions as numbers
        System.out.println("\nCurrent Positions:");
        System.out.println("  Tortoise: " + tortoisePosition);
        System.out.println("  Hare: " + harePosition);
        
        System.out.println(); // Extra line for readability
    }
    
    // Announce the winner
    private void announceWinner(boolean tortoiseWon, boolean hareWon) {
        System.out.println("=================================================================");
        System.out.println("🎉 RACE FINISHED! 🎉");
        
        if (tortoiseWon && hareWon) {
            System.out.println("IT'S A TIE! BOTH RACERS FINISHED TOGETHER!");
        } else if (tortoiseWon) {
            System.out.println("TORTOISE WINS THE RACE!");
        } else {
            System.out.println("HARE WINS THE RACE!");
        }
        
        System.out.println("Final Positions:");
        System.out.println("  Tortoise: " + tortoisePosition);
        System.out.println("  Hare: " + harePosition);
        System.out.println("=================================================================");
    }
}
