package CircularLinkedList.OnlineTicketReservationSystem;
import java.util.Scanner;
public class 1TicketReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CircularLinkedList ticketList = new CircularLinkedList();

        while (true) {
            System.out.println("1. Book Ticket\n2. Cancel Ticket\n3. View Tickets\n4. Search Ticket\n5. Total Bookings\n6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Ticket ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Customer Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Movie Name: ");
                    String movie = scanner.nextLine();
                    System.out.print("Enter Seat Number: ");
                    String seat = scanner.nextLine();
                    System.out.print("Enter Booking Time: ");
                    String time = scanner.nextLine();
                    ticketList.addTicket(id, name, movie, seat, time);
                    break;
                case 2:
                    System.out.print("Enter Ticket ID to cancel: ");
                    int removeID = scanner.nextInt();
                    ticketList.removeTicket(removeID);
                    break;
                case 3:
                    ticketList.displayTickets();
                    break;
                case 4:
                    System.out.print("Enter Customer Name or Movie Name to search: ");
                    String keyword = scanner.nextLine();
                    ticketList.searchTicket(keyword);
                    break;
                case 5:
                    System.out.println("Total Booked Tickets: " + ticketList.totalTickets());
                    break;
                case 6:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
