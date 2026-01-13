package day05_arrays;

/**
 * Shows why loops and arrays work together
 */
public class LoopArrayRelationship {
    public static void main(String[] args) {
        int[] scores = {90, 75, 80, 95};
//        System.out.println(scores.length);

        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        double average = (double) sum / scores.length;

        System.out.println("Average = " + average);
    }
}
