package day05_arrays;

/**
 * Common array operations
 */
public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Max = " + max);
    }
}
