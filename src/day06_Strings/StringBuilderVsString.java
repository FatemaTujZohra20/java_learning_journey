package day06_Strings;

//      When to Use What:
// -----------------------------------------------
//      Use String --> when value never changes
//      Use StringBuilder --> when modifying inside loop
//      Use StringBuffer --> when thread safety is required
//

/**
 * =========================================================
 *  StringBuilderVsString
 * =========================================================
 *
 * This class demonstrates:
 *  1. Why using String for repeated modification is inefficient
 *  2. How String immutability causes performance problems
 *  3. How StringBuilder solves this problem efficiently
 * ---------------------------------------------------------
 * CORE IDEA
 * ---------------------------------------------------------
 * String is IMMUTABLE.
 * StringBuilder is MUTABLE.
 * --------------------------------
 * When Strings are modified inside loops, Java creates
 * many unnecessary objects.
 * StringBuilder modifies the same object in memory.
 */
public class StringBuilderVsString {
    public static void main(String[] args) {
        /**
         * =========================================================
         *  Using String (INEFFICIENT APPROACH)
         * =========================================================
         * Even though this code looks simple,
         * it is VERY expensive internally.
         */

        String s = "";   // Empty String literal stored in String Pool

        for (int i = 0; i < 5; i++) {

            /**
             * IMPORTANT:
             * ------------
             * This line:
             *
             *     s = s + i;
             *
             * does NOT modify the existing String.
             *
             * Instead, Java performs:
             *
             * 1. Creates a new StringBuilder internally
             * 2. Appends old value of 's'
             * 3. Appends 'i'
             * 4. Converts it back to a NEW String object
             * 5. Assigns the new reference to 's'
             *
             * OLD String objects become garbage.
             */

            s = s + i;
        }

        System.out.println(s); // Output: 01234


        /**
         * MEMORY BEHAVIOR (Simplified)
         *
         * Iteration 0 → ""
         * Iteration 1 → "0"
         * Iteration 2 → "01"
         * Iteration 3 → "012"
         * Iteration 4 → "0123"
         * Iteration 5 → "01234"
         *
         * Total objects created ≈ MANY (Strings + StringBuilders)
         */

        /**
         * =========================================================
         *  Using StringBuilder (EFFICIENT APPROACH)
         * =========================================================
         *
         * StringBuilder is MUTABLE.
         * It changes the SAME object instead of creating new ones.
         */

        StringBuilder sb = new StringBuilder();
        // Creates ONE mutable object in Heap memory

        for (int i = 0; i < 5; i++) {

            /**
             * append() modifies the internal character array
             * of the SAME StringBuilder object.
             *
             * No new objects are created.
             */
            sb.append(i);
        }

        /**
         * toString() creates ONE final String object
         * when we actually need a String.
         */
        System.out.println(sb.toString()); // Output: 01234
    }
}
