package day07_OOP_Basic.Polymorphism.Exercise08;

public class Exercise08_Main {
    public static void main(String[] args) {

        Logger logger = new FileLogger(); // change at runtime
        logger.log("System started");
    }
}
