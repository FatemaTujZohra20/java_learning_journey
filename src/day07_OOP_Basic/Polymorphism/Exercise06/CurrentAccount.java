package day07_OOP_Basic.Polymorphism.Exercise06;

public class CurrentAccount extends BankAccount{
    @Override
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Current withdrawal: " + amount);
    }
}
