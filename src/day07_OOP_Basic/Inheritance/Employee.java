package day07_OOP_Basic.Inheritance;

public class Employee {
    int id;
    String name;
    double salary;

    void displayEmployeeInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
