package day07_OOP_Basic.Polymorphism.Exercise02;

public class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
