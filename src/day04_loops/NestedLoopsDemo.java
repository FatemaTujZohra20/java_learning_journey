package day04_loops;

/**
 * Demonstrates nested loops
 */
public class NestedLoopsDemo {
    public static void main(String[] args) {

        // Multiplication table (1 to 3)
        for (int i = 1; i <= 3; i++) {
//            System.out.println("Outer Loop start...");
//            System.out.println("Outer loop #" + i + ": " + i);
            for (int j = 1; j <= 3; j++) {
//                System.out.println("Inner Loop start...");
//                System.out.println("Inner loop #" + i + ": " + j);
//                System.out.print("When i is " + "=" + i + ", j = " + i * j + " ");
                System.out.print(i * j + " ");
            }
//            System.out.println("Inner Loop end...");
            System.out.println();
        }
//        System.out.println("Outer Loop end...");
    }
}
