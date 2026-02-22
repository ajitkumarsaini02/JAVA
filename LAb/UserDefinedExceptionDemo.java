
import java.util.Scanner;

// Step 1: Create Custom Exception Class
class NegativeAmountException extends Exception {

    public NegativeAmountException(String message) {
        super(message);
    }
}

// Step 2: Bank Class
class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) throws NegativeAmountException {

        if (amount < 0) {
            throw new NegativeAmountException("Amount cannot be negative!");
        }

        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}


// Step 3: Main Class
public class UserDefinedExceptionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("User Defined Exception Demo");
        System.out.println("----------------------------");

        BankAccount account = new BankAccount(1000);

        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        try {
            account.deposit(amount);
        }
        catch (NegativeAmountException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        account.displayBalance();

        sc.close();
    }
}