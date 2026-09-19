package day08_type_conversion_and_type_casting.type_casting;

/**
 * Demonstrates narrowing conversion from double to float.
 * <p>
 * double is a 64-bit floating-point type.
 * float is a 32-bit floating-point type.
 * <p>
 * Because float provides less precision than double,
 * converting double to float may cause precision loss.
 * <p>
 * Therefore, explicit casting is required.
 */
public class DoubleToFloat {
    public static void main(String[] args) {
        
        /*
         * A double can store more precision than a float.
         */
        double preciseNumber = 123.456789123456;
        
        /*
         * Explicit narrowing conversion:
         *
         * (float) tells Java to convert the double
         * into a float.
         *
         * Because float has less precision,
         * some digits may be lost.
         */
        float convertedNumber = (float) preciseNumber;
        
        System.out.println("Original double value: " + preciseNumber);
        System.out.println("After narrowing to float: " + convertedNumber);
    }
}
