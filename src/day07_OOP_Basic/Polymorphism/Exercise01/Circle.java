package day07_OOP_Basic.Polymorphism.Exercise01;

public class Circle extends Shape {
    double radius = 5;

    @Override
    void calculateArea() {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }
}
