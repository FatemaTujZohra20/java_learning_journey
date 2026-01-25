package day07_OOP_Basic.Inheritance;

public class Developer extends Employee {
    String programmingLanguage;

    void displayDeveloperInfo() {
        displayEmployeeInfo(); // inherited method
        System.out.println("Language: " + programmingLanguage);
    }
}
