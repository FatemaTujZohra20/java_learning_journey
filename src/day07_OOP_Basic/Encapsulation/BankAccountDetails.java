package day07_OOP_Basic.Encapsulation;

public class BankAccountDetails {
    // private data (hidden from outside)
    private int accountNumber;
    private String accountHolder;
    private double balance;


    // Constructor to initialize object
    BankAccountDetails (int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter (read-only access)
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Setter with validation (controlled update)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}
