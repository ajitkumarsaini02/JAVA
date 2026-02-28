public class BankAccount {
    String accountNumber;
    static String bankName;
    String accountHolderName;
    String branch;
    double balance;
    public BankAccount(String accountHolderName, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.branch = "Main Branch";
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
        System.out.println("Bank Name: " + bankName);
        System.out.println("Branch: " + branch);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount.bankName = "State Bank of India";
        BankAccount account = new BankAccount("John Doe",
                        "123456789", 1000.0);
        account.displayAccountInfo();
        account.deposit(500.0);
        account.getBalance();
        account.withdraw(200.0);
        account.getBalance();
    }
}
