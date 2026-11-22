
class TicketCounter {
    int availableSeats = 5;

    synchronized void bookTicket(String name, int seats) {
        System.out.println(name + " is booking " + seats + " seats.");

        if (seats <= availableSeats) {
            availableSeats -= seats;
            System.out.println("Booking successful for " + name);
            System.out.println("Seats remaining: " + availableSeats);
        } else {
            System.out.println("Booking failed for " + name);
        }
    }
}

class Customer extends Thread {
    TicketCounter counter;
    int seats;

    Customer(TicketCounter counter, String name, int seats) {
        super(name);
        this.counter = counter;
        this.seats = seats;
    }

    public void run() {
        counter.bookTicket(getName(), seats);
    }
}

public class TicketBooking {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();

        Customer c1 = new Customer(counter, "Aman", 2);
        Customer c2 = new Customer(counter, "Riya", 3);
        Customer c3 = new Customer(counter, "Kabir", 2);

        c1.start();
        c2.start();
        c3.start();
    }
}
