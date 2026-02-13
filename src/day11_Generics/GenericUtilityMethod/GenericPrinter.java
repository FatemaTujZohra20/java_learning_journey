package day11_Generics.GenericUtilityMethod;

/**
 * GenericPrinter
 *
 * Demonstrates a basic generic method in Java.
 * This method can accept any type of object.
 *
 * Concept Covered:
 * - Method-level generics
 * - Type inference
 */
public class GenericPrinter {
    
    /**
     * Prints any type of value passed to it.
     *
     * @param <T>   The type parameter
     * @param value The value to be printed
     */
    private static <T> void printValue (T value) {
        System.out.println("Value: " + value);
    }
    
    
    public static void main (String[] args) {
        
        // Java automatically infers type
        printValue(200);          // Integer
        printValue(20.5);         // Double
        printValue("Hi Java"); // String
    }
}