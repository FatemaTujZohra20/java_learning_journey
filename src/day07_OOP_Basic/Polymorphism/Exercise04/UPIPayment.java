package day07_OOP_Basic.Polymorphism.Exercise04;

public class UPIPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
