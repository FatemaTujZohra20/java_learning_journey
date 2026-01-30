package day07_OOP_Basic.Polymorphism.Exercise05;

public class EmailNotification extends Notification {
    @Override
    void send() {
        System.out.println("Sending Email");
    }
}
