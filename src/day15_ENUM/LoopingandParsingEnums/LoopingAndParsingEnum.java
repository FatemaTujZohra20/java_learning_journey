package day15_ENUM.LoopingandParsingEnums;

public class LoopingAndParsingEnum {
    public static void main(String[] args) {
        
        // --- 1. Looping through all Enum values ---
        // The .values() method returns an array of all constants in the order declared.
        System.out.println("Available Levels:");
        for (Level3 level : Level3.values()) {
            System.out.println("- " + level + " (Score: " + level.getLevelScore() + ")");
        }
        
        System.out.println("--------------------------------");
        
        // --- 2. Converting a String to an Enum (Parsing) ---
        // Imagine this string came from a database or a user typing in a console.
        String userInput = "HIGH";
        
        try {
            // .valueOf() looks for an exact case-sensitive match.
            Level3 convertedLevel = Level3.valueOf(userInput);
            System.out.println("Successfully converted string to: " + convertedLevel);
            
        } catch (IllegalArgumentException e) {
            // If the string doesn't match (e.g., "SUPER_HIGH"), Java throws an error.
            System.out.println("Error: That is not a valid Level!");
        }
    }
}
