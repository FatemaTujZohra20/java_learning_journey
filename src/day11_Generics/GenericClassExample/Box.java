package day11_Generics.GenericClassExample;

/**
 * Box<T>
 *
 * A generic class that can store any type of object.
 *
 * Concept Covered:
 * - Class-level generics
 * - Type safety
 */
public class Box<T> {
    
    private T value;  // Generic type variable
    
    /**
     * Constructor to initialize value
     */
    public Box (T value) {
        this.value = value;
    }
    
    /**
     * Getter method
     */
    public T getValue () {
        return value;
    }
    
    /**
     * Setter method
     */
    public void setValue (T value) {
        this.value = value;
    }
    
    
    public static void main (String[] args) {
        
        // Integer Box
        Box<Integer> intBox = new Box<>(10);
        System.out.println("Integer value: " + intBox.getValue());
        
        // String Box
        Box<String> strBox = new Box<>("Generics Example");
        System.out.println("String value: " + strBox.getValue());
    }
}
