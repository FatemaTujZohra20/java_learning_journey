package day07_OOP_Basic.Encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccountDetails account = new BankAccountDetails(101, "Fatema", 5000);

        // Direct access Not allowed
        // account.balance = 100000;

        // Access via methods
        account.deposit(2000);
        account.withdraw(1500);

        System.out.println("Account No: " + account.getAccountNumber());
        System.out.println("Holder: " + account.getAccountHolder());
        System.out.println("Balance: " + account.getBalance());
    }
}
