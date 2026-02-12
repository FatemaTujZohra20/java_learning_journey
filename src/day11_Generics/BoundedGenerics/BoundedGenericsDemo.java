package day11_Generics.BoundedGenerics;

public class BoundedGenericsDemo {
    public static void main(String[] args) {
        // --- Single Bound Test ---
        NumberBox<Integer> box1 = new NumberBox<>(10);  // Valid: Integer is a Number
        System.out.println("Box 1 Double: " + box1.getAsDouble());
        
        // NumberBox<String> box2 = new NumberBox<>("Hi"); // ERROR: String is not a Number
        
        // --- Multiple Bound Test ---
        // Integer extends Number AND implements Comparable<Integer>
        Data<Integer> myData = new Data<>(50);
        System.out.println("Data Value: " + myData.getAsInt());
        System.out.println("Comparison: " + myData.compareToOther(20)); // Prints 1 (meaning 50 > 20)
        
        /*
         * Note: Most standard wrapper classes (Integer, Double, etc.)
         * work with Example 2 because they are designed to be numbers
         * and are naturally comparable.
         */
    }
}
