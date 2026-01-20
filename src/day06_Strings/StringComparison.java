package day06_Strings;

/**
 * Shows difference between reference comparison and value comparison.
 *      == --> compares memory address
 *      .equals() --> compares content
 */
public class StringComparison {
    public static void main(String[] args) {
        String a = "Hello";
        String b = new String("Hello");

        System.out.println(a == b);        // false
        System.out.println(a.equals(b));   // true
    }
}
