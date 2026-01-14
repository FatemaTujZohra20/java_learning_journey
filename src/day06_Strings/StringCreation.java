package day06_Strings;

/**
 * =========================================================
 *  StringCreation
 * =========================================================
 *
 * This class explains:
 *  1. What the String Pool is
 *  2. How String literals are stored
 *  3. Difference between String literal and new String()
 *  4. Why '==' behaves differently from equals()
 *
 * ---------------------------------------------------------
 * WHAT IS STRING POOL?
 * ---------------------------------------------------------
 * The String Pool is a special memory area inside the
 * Heap where Java stores String literals.
 *
 * PURPOSE:
 * - Save memory
 * - Improve performance
 * - Avoid duplicate String objects
 *
 * If two String literals have the same value,
 * Java reuses the same object from the String Pool.
 */
public class StringCreation {
    public static void main(String[] args) {

        /**
         * ---------------------------------------------------------
         * 1️⃣ String literal creation
         * ---------------------------------------------------------
         *
         * When a String is created using double quotes (""),
         * Java first checks the String Pool.
         *
         * - If the value already exists → reuse it
         * - If not → create a new String in the pool
         */
        // String literal (stored in String Pool)
        String s1 = "Java";     // "Java" is added to String Pool
        String s2 = "Java";     // Reuses the same "Java" from pool

        /**
         * MEMORY VIEW (Simplified)
         *
         * String Pool:
         *   ┌───────────┐
         *   │  "Java"   │  ← s1, s2 both point here
         *   └───────────┘
         */
        System.out.println(s1 == s2); // true (same pool reference)
        // Why true?
        // Because s1 and s2 refer to the SAME memory address

        /**
         * ---------------------------------------------------------
         * 2️⃣ Using new keyword
         * ---------------------------------------------------------
         *
         * 'new String("Java")' ALWAYS creates a new object
         * in the Heap, even if the value already exists
         * in the String Pool.
         */
        String s3 = new String("Java");


        /**
         * MEMORY VIEW (Simplified)
         *
         * String Pool:            Heap:
         *   ┌───────────┐        ┌───────────┐
         *   │  "Java"   │        │  "Java"   │
         *   └───────────┘        └───────────┘
         *        ↑                     ↑
         *      s1, s2                 s3
         */

        System.out.println(s1 == s3); // false (different memory)
        // Why false?
        // s1 points to String Pool object
        // s3 points to a DIFFERENT object in Heap

        /**
         * ---------------------------------------------------------
         * 3️⃣ equals() comparison
         * ---------------------------------------------------------
         *
         * equals() compares CONTENT, not memory address.
         */

        System.out.println(s1.equals(s3)); // true (same content)
        // Both Strings contain the same characters: "Java"
    }
}
