package day07_OOP_Basic.Polymorphism.Exercise07;

// Shape Drawing Engine - Factory-style Main
public class Exercise07_Main {
    static Shape getShape(int type) {
        if (type == 1) return new Circle();
        if (type == 2) return new Square();
        return new Triangle();
    }

    public static void main(String[] args) {
        Shape shape = getShape(2);
        shape.draw();
    }
}
