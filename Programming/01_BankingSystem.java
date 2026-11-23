
abstract class BankAccount {
    protected String name;
    protected double balance;

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    abstract double calculateInterest();

    void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: Rs. " + balance);
        System.out.println("Interest: Rs. " + calculateInterest());
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    
    double calculateInterest() {
        return balance * 0.04;
    }
}

class FixedDeposit extends BankAccount {
    FixedDeposit(String name, double balance) {
        super(name, balance);
    }

    double calculateInterest() {
        return balance * 0.07;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount a1 = new SavingsAccount("Aarav", 20000);
        BankAccount a2 = new FixedDeposit("Diya", 50000);

        a1.display();
        System.out.println();

        a2.display();
    }
}
