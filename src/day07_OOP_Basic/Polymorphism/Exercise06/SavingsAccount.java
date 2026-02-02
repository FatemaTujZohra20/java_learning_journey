package day07_OOP_Basic.Polymorphism.Exercise06;

public class SavingsAccount extends BankAccount{
    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Savings withdrawal: " + amount);
        }
    }
}
