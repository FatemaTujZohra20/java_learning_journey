package day07_OOP_Basic.Polymorphism.Exercise08;

public class DatabaseLogger extends Logger {
    @Override
    void log(String message) {
        System.out.println("Database: " + message);
    }
}
