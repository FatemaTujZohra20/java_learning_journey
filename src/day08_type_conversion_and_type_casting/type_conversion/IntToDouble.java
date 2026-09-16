package day08_type_conversion_and_type_casting.type_conversion;

/**
 * Demonstrates automatic widening conversion from int to double.
 * <p>
 * Conversion:
 * <p>
 * int → double
 * <p>
 * Java automatically performs this conversion because
 * double can represent the value of an int.
 */
public class IntToDouble {
    public static void main(String[] args){
        
        // An integer value.
        int number = 25;
        
        /*
         * Automatic widening conversion happens here.
         *
         * The int value 25 becomes the double value 25.0.
         *
         * No explicit cast is required.
         */
        
        double convertedNumber = number;
        
        // Display the original value.
        System.out.println("Original int value: " + number);
        
        // Display the converted double value.
        System.out.println("Converted double value: " + convertedNumber);
    
    }
}
