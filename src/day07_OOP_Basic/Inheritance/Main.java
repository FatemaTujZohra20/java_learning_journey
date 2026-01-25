package day07_OOP_Basic.Inheritance;

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer();

        // Parent class fields
        dev.id = 1;
        dev.name = "Fatema";
        dev.salary = 70000;

        // Child class field
        dev.programmingLanguage = "Java";

        dev.displayDeveloperInfo();
    }
}