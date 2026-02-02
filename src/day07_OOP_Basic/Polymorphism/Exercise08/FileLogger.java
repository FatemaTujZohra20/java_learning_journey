package day07_OOP_Basic.Polymorphism.Exercise08;

public class FileLogger extends Logger {
    @Override
    void log(String message) {
        System.out.println("File: " + message);
    }
}
