package day08_type_conversion_and_type_casting.type_casting;

/**
 * Demonstrates narrowing conversion from long to int.
 * <p>
 * long is a 64-bit signed integer type.
 * int is a 32-bit signed integer type.
 * <p>
 * Since int has a smaller range than long,
 * Java requires explicit casting.
 */
public class LongToInt {
    public static void main(String[] args) {
        
        // long can store much larger integer values than int.
        long population = 17000000000L;
        
        /*
         * Explicit narrowing conversion:
         *
         * (int) converts the long value into an int.
         *
         * WARNING:
         * The long value is larger than the maximum value
         * that an int can safely represent.
         *
         * int range:
         * -2,147,483,648 to 2,147,483,647
         *
         * Therefore, information may be lost.
         */
        int populationAsInt = (int) population;
        
        System.out.println("Original long value: " + population);
        System.out.println("After narrowing to int: " + populationAsInt);
    }
}
