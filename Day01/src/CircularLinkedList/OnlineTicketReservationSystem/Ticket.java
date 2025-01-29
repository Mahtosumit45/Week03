package CircularLinkedList.OnlineTicketReservationSystem;

import java.util.Scanner;

class Ticket {
    int ticketID;
    String customerName, movieName, seatNumber, bookingTime;
    Ticket next;

    public Ticket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}
