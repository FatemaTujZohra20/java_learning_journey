package day04_loops;

/**
 * Demonstrates break and continue
 */
public class LoopControlStatements {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i == 6) {
                continue; // skip 6
            }

            if (i == 9) {
                break; // stop loop
            }

            System.out.println(i);
        }
    }
}
