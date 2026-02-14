package day11_Generics.MultipleBounds;

/**
 * MaxFinder
 *
 * Demonstrates multiple bounds using Comparable.
 *
 * Concept Covered:
 * - <T extends Comparable<T>>
 * - Generic comparison
 */
public class MaxFinder {
    
    /**
     * Returns maximum of two comparable values.
     *
     * @param <T> Type that implements Comparable
     * @param a   First value
     * @param b   Second value
     * @return maximum value
     */
    public static <T extends Comparable<T>> T findMax(T a, T b) {
        
        // compareTo returns positive if a > b
        return (a.compareTo(b) > 0) ? a : b;
    }
    
    public static void main(String[] args) {
        
        System.out.println("Max Integer: " + findMax(10, 20));
        System.out.println("Max String: " + findMax("Apple", "Banana"));
        System.out.println("Max Double: " + findMax(10.5, 5.2));
    }
}
