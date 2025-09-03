package oops_concept;

class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void bookTicket(String seat, double ticketPrice) {
        this.seatNumber = seat;
        this.price = ticketPrice;
        System.out.println("Ticket booked successfully!");
    }

    public void displayDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);
    }
}

public class oops9 {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Inception", "A10", 250);
        ticket.displayDetails();
        ticket.bookTicket("B15", 300);
        ticket.displayDetails();
    }
}
