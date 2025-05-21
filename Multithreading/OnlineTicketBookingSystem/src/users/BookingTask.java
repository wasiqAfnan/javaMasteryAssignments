/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users;

import booking.TicketBooking;

public class BookingTask implements Runnable {
    private TicketBooking booking;
    private String user;
    private int tickets;

    public BookingTask(TicketBooking booking, String user, int tickets) {
        this.booking = booking;
        this.user = user;
        this.tickets = tickets;
    }

    @Override
    public void run() {
        booking.bookTicket(user, tickets);
    }
}

