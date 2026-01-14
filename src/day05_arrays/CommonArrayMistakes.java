package day05_arrays;

/**
 * Common array mistakes
 */
public class CommonArrayMistakes {
    public static void main(String[] args) {

        int[] arr = new int[3];

        // Wrong: ArrayIndexOutOfBoundsException
//         arr[3] = 10;

        // Right:  Correct
        arr[2] = 10;
        System.out.println("Right way.");

        // Wrong: NullPointerException
//         int[] nums = null;
//         System.out.println(nums.length);
    }
}
