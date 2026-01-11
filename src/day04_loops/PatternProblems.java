package day04_loops;

/**
 * Pattern printing problems
 */
public class PatternProblems {
    public static void main(String[] args) {

        int n = 5;

        // Pattern 1: Square
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Pattern 2: Right Triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
