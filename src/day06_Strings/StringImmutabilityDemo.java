package day06_Strings;

/**
 * Demonstrates String immutability.
 * ---------------------------------------
 * Why original didn’t change??
 *      Strings cannot be modified
 *      Any change creates a new String object
 */
public class StringImmutabilityDemo {
    public static void main(String[] args) {
        String original = "Java";
        String modified = original.concat(" Programming");

        System.out.println(original); // Java
        System.out.println(modified); // Java Programming
    }
}
