// Write a Java program to create a BankAccount class using encapsulation (private data members) and perform operations such as 
// deposit, withdraw, and display balance using menu-driven choices.
public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolderName, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public void getBalance(){
        System.out.println("Current Balance: " + balance);
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        // display menu driven choices
        BankAccount account = new BankAccount("John Doe", "123456789", 1000.0);
        account.displayAccountInfo();
        account.deposit(500.0);
        account.getBalance();
        account.withdraw(200.0);
        account.getBalance();
    }
    
}
