package day11_Generics;

/**
 * MULTI-TYPE GENERIC CLASS: Pair<K, V>
 * Here, we use two placeholders:
 * K -> Typically represents a 'Key'.
 * V -> Typically represents a 'Value'.
 * * These two types can be the same (String, String) or completely
 * different (Integer, String), giving the class massive flexibility.
 */
class Pair<K, V> {
    // Both fields are typed dynamically based on what the user provides.
    private K key;
    private V value;
    
    // Constructor: Assigns the specific types at runtime.
    public Pair (K key, V value) {
        this.key = key;
        this.value = value;
    }
    
    // Returns the type assigned to K
    public K getKey() {
        return key;
    }
    
    // Returns the type assigned to V
    public V getValue() {
        return value;
    }
    
    /**
     * Overriding toString() allows us to print the object directly
     * and see its content instead of a memory address.
     */
    @Override
    public String toString () {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}


/**
 * MAIN CLASS: MultipleTypeParameters
 */
public class MultipleTypeParameters {
    public static void main (String[] args) {
        /*
         * 1. Instantiation:
         * We define K as Integer and V as String.
         * The Diamond Operator (<>) on the right side infers the types
         * from the left side.
         */
        Pair<Integer, String> student = new Pair<>(1, "Fatema");
        
        // 2. Direct Access:
        // No casting is needed because the compiler knows exactly what types to expect.
        System.out.println(student.getKey());   // Prints 1
        System.out.println(student.getValue());    // Prints Fatema
        
        // 3. Printing the Object:
        // This calls our overridden toString() method automatically.
        System.out.println(student.toString());
    }

}
