package day04_loops;

/**
 * Demonstrates loop optimization ideas
 */
public class LoopOptimizations {
    public static void main(String[] args) {

        int n = 10;

        // Inefficient way
        for (int i = 0; i < n; i++) {
            System.out.println("Hello");
        }

        // Optimized idea: reduce work inside loop
        String message = "Hello2";
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }

        // Loop with step optimization
        for (int i = 0; i < n; i += 2) {
            System.out.println("Even index: " + i);
        }
    }
}
