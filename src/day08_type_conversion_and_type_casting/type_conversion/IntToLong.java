package day08_type_conversion_and_type_casting.type_conversion;

/**
 * Demonstrates automatic widening conversion from int to long.
 * <p>
 * Widening conversion happens when a value is converted
 * from a smaller compatible primitive type to a larger type.
 * <p>
 * In this example:
 * <p>
 * int → long
 * <p>
 * Java performs this conversion automatically.
 * No explicit casting is required.
 */
public class IntToLong {
    public static void main(String[] args){
        
        // 'number' is an int value.
        int number = 1000;
        
        /*
         * Java automatically converts the int value
         * into a long value.
         *
         * We do NOT need to write:
         *
         * long convertedNumber = (long) number;
         *
         * because this is an automatic widening conversion.
         */
        long convertedNumber = number;
        
        // Display the original int value.
        System.out.println("Original int value: " + number);
        
        // Display the converted long value.
        System.out.println("Converted long value: " + convertedNumber);
    }
    
}
