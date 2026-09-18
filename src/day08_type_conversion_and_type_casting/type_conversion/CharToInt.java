package day08_type_conversion_and_type_casting.type_conversion;

/**
 * Demonstrates automatic widening conversion from char to int.
 * <p>
 * Conversion:
 * <p>
 * char → int
 * <p>
 * Java stores a char as a 16-bit unsigned Unicode value.
 * When a char is assigned to an int, Java automatically
 * converts the character into its numeric Unicode value.
 */
public class CharToInt {
    public static void main(String[] args) {
        
        // Store the character 'A'.
        char letter = 'A';
        
        /*
         * Automatic widening conversion:
         *
         * char → int
         *
         * The character 'A' has the Unicode value 65.
         *
         * Java automatically converts:
         *
         * 'A' → 65
         */
        int numericValue = letter;
        
        // Display the original character.
        System.out.println("Original char value: " + letter);
        
        // Display the numeric Unicode value.
        System.out.println("Converted int value: " + numericValue);
    }
}
