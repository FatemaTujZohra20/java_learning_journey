package day06_Strings;

/**
 * Demonstrates commonly used String methods.
 */
public class StringMethods {
    public static void main(String[] args) {

        String text = "  Java Programming  ";

        System.out.println(text.length());            // length
        System.out.println(text.trim());              // remove spaces
        System.out.println(text.toUpperCase());       // uppercase
        System.out.println(text.toLowerCase());       // lowercase
        System.out.println(text.contains("Java"));    // true
        System.out.println(text.substring(2, 6));     // Java
        System.out.println(text.replace("Java", "C"));
    }
}
