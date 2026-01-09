package day03_conditionals;

/**
    Learning:
    * Defensive programming
    * Validating inputs before using them
    * Real-world habit (used in APIs & backend)
 */
public class InputValidation {
    public static void main(String[] args) {

        int age = -5;

        if (age < 0) {
            System.out.println("Invalid age! Age cannot be negative.");
        } else if (age > 120) {
            System.out.println("Invalid age! Age seems unrealistic.");
        } else {
            System.out.println("Valid age entered: " + age);
        }
    }
}
