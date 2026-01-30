package day07_OOP_Basic.Polymorphism.Exercise04;

public class Exercise04_Main {
    public static void main(String[] args) {

        Payment[] payments = {
                new CreditCardPayment(),
                new UPIPayment(),
                new CashPayment()
        };

        for (Payment p : payments) {
            p.pay(1000);
        }
    }
}
