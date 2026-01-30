package day07_OOP_Basic.Polymorphism.Exercise05;

public class Exercise05_Main {
    public static void main(String[] args) {

        NotificationService service = new NotificationService();

        service.sendNotification(new EmailNotification());
        service.sendNotification(new SMSNotification());
        service.sendNotification(new PushNotification());
    }
}
