package day07_OOP_Basic.Polymorphism.Exercise02;

public class Exercise02_Main {
    public static void main(String[] args) {

        Animal[] animals = {
                new Dog(),
                new Cat()
        };

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
