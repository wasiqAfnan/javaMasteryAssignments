/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package booking;

public class TicketBooking {
    private int availableTickets;

    public TicketBooking(int totalTickets) {
        this.availableTickets = totalTickets;
    }

    public synchronized boolean bookTicket(String user, int tickets) {
        if (tickets <= availableTickets) {
            System.out.println(user + " successfully booked " + tickets + " ticket(s).");
            availableTickets -= tickets;
            return true;
        } else {
            System.out.println(user + " failed to book " + tickets + " ticket(s). Not enough tickets available.");
            return false;
        }
    }
}

