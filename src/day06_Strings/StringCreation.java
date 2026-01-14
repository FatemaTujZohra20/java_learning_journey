package day06_Strings;

/**
 * Demonstrates different ways to create Strings
 * and explains String Pool behavior.
 */
public class StringCreation {
    public static void main(String[] args) {

        // String literal (stored in String Pool)
        String s1 = "Java";
        String s2 = "Java";

        // Using new keyword (stored in Heap)
        String s3 = new String("Java");

        System.out.println(s1 == s2); // true (same pool reference)
        System.out.println(s1 == s3); // false (different memory)
        System.out.println(s1.equals(s3)); // true (same content)
    }
}
