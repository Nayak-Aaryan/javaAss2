package Q9pack;

public abstract class MovieTicket {
    public String movieName;
    public String theaterName;
    public int numTickets;
    public double totalPrice;

    public abstract void calculateTotalPrice();

    public void confirmBooking() {
        calculateTotalPrice();
        System.out.println("Movie: " + movieName);
        System.out.println("Theater: " + theaterName);
        System.out.println("Tickets: " + numTickets);
        System.out.println("Total Price: " + totalPrice);
    }
}
------------------------------------------------------------
package Q9pack;

public class RegularTicket extends MovieTicket {

    public void calculateTotalPrice() {
        if (numTickets <= 0) {
            System.out.println("Invalid number of tickets");
            totalPrice = 0;
            return;
        }
        if (numTickets > 15) {
            System.out.println("Booking limit exceeded");
            totalPrice = 0;
            return;
        }

        totalPrice = numTickets * 250;

        if (numTickets > 10) {
            totalPrice -= totalPrice * 0.20;
        } else if (numTickets > 5) {
            totalPrice -= totalPrice * 0.10;
        }
    }
}
-------------------------------------------------------------
package Q9pack;

public class PremiumTicket extends MovieTicket {

    public void calculateTotalPrice() {
        if (numTickets <= 0) {
            System.out.println("Invalid number of tickets");
            totalPrice = 0;
            return;
        }
        if (numTickets > 15) {
            System.out.println("Booking limit exceeded");
            totalPrice = 0;
            return;
        }

        totalPrice = numTickets * 300;

        if (numTickets > 10) {
            totalPrice -= totalPrice * 0.20;
        } else if (numTickets > 5) {
            totalPrice -= totalPrice * 0.10;
        }
    }
}
-----------------------------------------------------------------------
package Q9pack;

public class VIPTicket extends MovieTicket {

    public void calculateTotalPrice() {
        if (numTickets <= 0) {
            System.out.println("Invalid number of tickets");
            totalPrice = 0;
            return;
        }
        if (numTickets > 15) {
            System.out.println("Booking limit exceeded");
            totalPrice = 0;
            return;
        }

        totalPrice = numTickets * 450;

        if (numTickets > 10) {
            totalPrice -= totalPrice * 0.20;
        } else if (numTickets > 5) {
            totalPrice -= totalPrice * 0.10;
        }

        if (numTickets > 8) {
            totalPrice -= 100;
        }
    }
}
---------------------------------------------------
import java.util.Scanner;
import Q9pack.*;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RegularTicket r = new RegularTicket();
        PremiumTicket p = new PremiumTicket();
        VIPTicket v = new VIPTicket();

        System.out.print("Enter Movie Name: ");
        String movie = sc.nextLine();

        System.out.print("Enter Theater Name: ");
        String theater = sc.nextLine();

        System.out.print("Enter Number of Tickets: ");
        int n = sc.nextInt();

        r.movieName = movie;
        r.theaterName = theater;
        r.numTickets = n;

        p.movieName = movie;
        p.theaterName = theater;
        p.numTickets = n;

        v.movieName = movie;
        v.theaterName = theater;
        v.numTickets = n;

        System.out.println("\nRegular Ticket:");
        r.confirmBooking();

        System.out.println("\nPremium Ticket:");
        p.confirmBooking();

        System.out.println("\nVIP Ticket:");
        v.confirmBooking();

        sc.close();
    }
}
