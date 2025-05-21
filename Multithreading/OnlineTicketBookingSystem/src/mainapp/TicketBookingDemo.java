/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainapp;

import booking.TicketBooking;
import users.BookingTask;

public class TicketBookingDemo {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking(5); // only 5 tickets available
        
        Thread t1 = new Thread(new BookingTask(booking, "User-1", 2));
        Thread t2 = new Thread(new BookingTask(booking, "User-2", 1));
        Thread t3 = new Thread(new BookingTask(booking, "User-3", 3));
        Thread t4 = new Thread(new BookingTask(booking, "User-4", 1));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

