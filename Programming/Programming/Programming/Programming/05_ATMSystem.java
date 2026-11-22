
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class ATM {
    double balance = 5000;

    void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount.");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient account balance.");
        }

        balance -= amount;
        System.out.println("Withdrawal successful: Rs. " + amount);
    }
}

public class ATMSystem {
    public static void main(String[] args) {
        ATM atm = new ATM();

        try {
            atm.withdraw(6000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Remaining balance: Rs. " + atm.balance);
            System.out.println("Transaction completed.");
        }
    }
}
