
interface Payment {
    void pay(double amount);
}

class UpiPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using UPI.");
    }
}

class CardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using Card.");
    }
}

class Order {
    int orderId;
    double amount;

    Order(int orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    void checkout(Payment payment) {
        System.out.println("Processing Order: " + orderId);
        payment.pay(amount);
        System.out.println("Order placed successfully.");
    }
}

public class OnlinePayment {
    public static void main(String[] args) {
        Order o1 = new Order(501, 1499);
        Order o2 = new Order(502, 2499);

        o1.checkout(new UpiPayment());
        o2.checkout(new CardPayment());
    }
}
