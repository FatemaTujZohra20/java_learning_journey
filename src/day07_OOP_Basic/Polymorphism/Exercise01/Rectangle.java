package day07_OOP_Basic.Polymorphism.Exercise01;

public class Rectangle extends Shape {
    double length = 4;
    double width = 6;

    @Override
    void calculateArea() {
        System.out.println("Rectangle Area: " + (length * width));
    }
}
