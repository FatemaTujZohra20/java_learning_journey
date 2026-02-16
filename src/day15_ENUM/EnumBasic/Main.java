package day15_ENUM.EnumBasic;

/**
 * The Main class serves as the entry point to demonstrate
 * how to initialize and use an Enum type.
 */
public class Main {
    public static void main (String[] args) {
        
        // 1. Declaration and Initialization
        // We specify the Type (Level) and access the constant using dot notation.
        Level myVar = Level.MEDIUM;
        
        // 2. Output
        // When printed, Java automatically calls the .toString() method
        // of the enum, which returns the name of the constant as a String.
        System.out.println(myVar);
        
        // 3. Example of how Enums are typically used in logic
        checkLevel(myVar);
    }
    
    /**
     * A helper method to demonstrate how enums work perfectly with switch statements.
     * @param input the Level to check
     */
    public static void checkLevel(Level input) {
        switch (input) {
            case LOW:
                System.out.println("Economy mode activated.");
                break;
            case MEDIUM:
                System.out.println("Normal mode activated.");
                break;
            case HIGH:
                System.out.println("Performance mode activated!");
                break;
        }
    }
}



