package day11_Generics;

/**
 * A Generic Class definition.
 * The <T> is a Type Parameter that acts as a placeholder.
 * It will be replaced by a real type (like String, Integer, etc.)
 * when the class is instantiated.
 */
class Box<T> {
    // This variable 'value' will be of whatever type T becomes.
    private T value;
    
    // Setter method using the generic type T
    public void setValue(T value) {
        this.value = value;
    }
    
    // Getter method returning the generic type T
    public T getValue() {
        return value;
    }
}


/**
 * Execution class to demonstrate how to use the Generic Box.
 */
public class GenericClassSyntax {
    public static void main (String[] args) {
        /*
         * 1. Instantiation with Type Specification:
         * We tell the compiler that this specific Box will only hold Strings.
         * The empty brackets '<>' are called the "Diamond Operator" (Java 7+).
         */
        Box<String> stringBox = new Box<>();
        
        // 2. Type Safety in action:
        // Because we defined it as Box<String>, the compiler only allows Strings.
        stringBox.setValue("Hi...");
        
        /*
         * 3. No Casting Required:
         * Without Generics, getValue() would return an Object, and we'd
         * have to manually cast it: String data = (String) stringBox.getValue();
         * With Generics, the compiler already knows it's a String.
         */
        String data = stringBox.getValue();
        
        System.out.println(data);
    }
}
