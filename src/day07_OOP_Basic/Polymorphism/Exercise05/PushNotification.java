package day07_OOP_Basic.Polymorphism.Exercise05;

public class PushNotification extends Notification {
    @Override
    void send() {
        System.out.println("Sending Push Notification");
    }
}
