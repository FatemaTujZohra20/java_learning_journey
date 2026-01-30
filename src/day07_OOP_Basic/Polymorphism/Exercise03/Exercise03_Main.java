package day07_OOP_Basic.Polymorphism.Exercise03;

public class Exercise03_Main {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();

        System.out.println(e1.calculateSalary());
        System.out.println(e2.calculateSalary());
    }
}
