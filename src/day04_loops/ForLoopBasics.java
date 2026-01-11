package day04_loops;

/**
 * Demonstrates basic usage of for loop
 */
public class ForLoopBasics {
    public static void main(String[] args) {

        // Print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // Sum of first 10 natural numbers
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
