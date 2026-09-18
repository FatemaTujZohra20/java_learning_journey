package day08_type_conversion_and_type_casting.type_casting;

/**
 * Demonstrates narrowing conversion from double to int.
 * <p>
 * Narrowing conversion means converting a wider primitive type
 * into a narrower primitive type.
 * <p>
 * Because narrowing may cause data loss, Java does NOT perform
 * this conversion automatically.
 * <p>
 * We must explicitly tell Java to perform the conversion
 * using a cast: (int)
 */
public class DoubleToInt {
    public static void main(String[] args) {
        
        // double can store decimal values.
        double price = 99.99;
        
        /*
         * Explicit casting:
         *
         * (int) tells Java:
         * "Convert the double value into an int."
         *
         * The decimal portion is discarded.
         *
         * 99.99 becomes 99.
         *
         * IMPORTANT:
         * Casting does NOT round the number.
         */
        int wholePrice = (int) price;
        
        System.out.println("Original double value: " + price);
        
        System.out.println("After narrowing to int: " + wholePrice);
    }
}
