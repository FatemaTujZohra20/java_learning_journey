package day07_OOP_Basic.Polymorphism.Exercise06;

// Same call --> different rules
public class Exercise06_Main {
    public static void main(String[] args) {

        BankAccount[] accounts = {
                new SavingsAccount(),
                new CurrentAccount()
        };

        for (BankAccount acc : accounts) {
            acc.withdraw(2000);
        }
    }
}
