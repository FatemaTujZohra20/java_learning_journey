package day05_arrays;

/**
 * Traversing arrays using loops
 */
public class ArrayTraversal {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};

        // Using for loop
        System.out.println("Inside for loop: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Enhanced for loop
        System.out.println("Inside enhanced for loop: ");
        for (int value : arr) {
            System.out.println(value);
        }
    }
}
