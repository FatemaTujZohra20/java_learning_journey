package day07_OOP_Basic.Polymorphism.Exercise01;

public class Exercise01_Main {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.calculateArea();
        s2.calculateArea();
    }
}
