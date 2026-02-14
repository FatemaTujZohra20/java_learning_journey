package day11_Generics.BoundedTypeParameter2;

/**
 * NumberCalculator
 *
 * Demonstrates bounded type parameters in generics.
 *
 * Concept Covered:
 * - Upper bound generics
 * - Restricting types using <T extends Number>
 */
public class NumberCalculator {
    
    /**
     * Returns square of a number.
     * Only works for Number types.
     *
     * @param <T>   Type that extends Number
     * @param value Numeric value
     * @return square of the number
     */
    public static <T extends Number> double square(T value) {
        return value.doubleValue();
    }
    
    public static void main(String[] args) {
        
        System.out.println("Square of Integer: " + square(10));
        System.out.println("Square of Integer: " + square(10.5));
        
        // square("Hello"); ❌ Not allowed
    }
}
