import java.util.Scanner;

class MovieTicket {
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    
    public MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    
    public double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    
    public double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return calculateTotal() * 0.10; // 10% discount
        } else {
            return 0.0;
        }
    }

    
    public double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    
    public void displayBill() {
        System.out.println("\n----- CINEMA TICKET BILL -----");
        System.out.println("Movie Name      : " + movieName);
        System.out.printf("Ticket Price    : ₹%.2f%n", ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.printf("Total Amount    : ₹%.2f%n", calculateTotal());
        System.out.printf("Discount        : ₹%.2f%n", calculateDiscount());
        System.out.printf("Final Amount    : ₹%.2f%n", calculateFinalAmount());
        System.out.println("-------------------------------");
    }
}

public class CinemaBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Movie Name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter Ticket Price: ");
        double ticketPrice = sc.nextDouble();

        System.out.print("Enter Number of Tickets: ");
        int numberOfTickets = sc.nextInt();

        
        MovieTicket ticket = new MovieTicket(movieName, ticketPrice, numberOfTickets);

        
        ticket.displayBill();

        sc.close();
    }
}