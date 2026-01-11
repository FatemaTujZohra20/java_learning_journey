package day04_loops;

/**
 * Demonstrates do-while loop
 * Executes at least once
 */
public class DoWhileLoopBasics {
    public static void main(String[] args) {

        int i = 10;

        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 7);
    }
}
