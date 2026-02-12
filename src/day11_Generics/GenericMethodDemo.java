package day11_Generics;

/**
 * UTILITY CLASS
 * This class doesn't need to be generic because only the
 * specific method inside it needs to handle different types.
 */
class Utility {
    
    /**
     * GENERIC METHOD: printArray
     * * <T>          : This is the type parameter. It tells the compiler this
     * is a generic method. It must appear BEFORE the return type.
     * void         : The return type (this method returns nothing).
     * T[] array    : The method accepts an array of type T.
     */
    public static <T> void printArray(T[] array) {
        
        // We use an enhanced for-loop (for-each) to iterate through the array.
        // Since 'element' is of type T, it works for any object type.
        
        for (T element : array) {
            System.out.println(element);
        }
    }
}


public class GenericMethodDemo {
    public static void main(String[] args) {
        
        // 1. Array of Integers (Integer is a Wrapper Class, so it's an Object)
        Integer[] numbs = {1, 2, 3};
        System.out.println("Printing Integer Array:");
        Utility.printArray(numbs);
        
        // 2. Array of Strings
        String[] greetings = {"Hello", "World", "Java"};
        System.out.println("\nPrinting String Array:");
        
        /*
         * Java uses 'Type Inference' here. You don't need to say
         * Utility.<String>printArray(greetings).
         * The compiler looks at the input and says, "Ah, that's a String array!"
         */
        Utility.printArray(greetings);
    
    }
}
