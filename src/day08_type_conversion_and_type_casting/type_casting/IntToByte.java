package day08_type_conversion_and_type_casting.type_casting;

/**
 * Demonstrates narrowing conversion from int to byte.
 * <p>
 * int is a 32-bit signed integer.
 * byte is an 8-bit signed integer.
 * <p>
 * byte can store values only from:
 * <p>
 * -128 to 127
 * <p>
 * Therefore, converting int to byte requires explicit casting.
 */
public class IntToByte {
    public static void main(String[] args) {
        
        // 100 is safely inside the byte range.
        int safeNumber = 100;
        
        /*
         * Explicit narrowing conversion.
         *
         * Since 100 fits inside byte's range,
         * the result remains 100.
         */
        byte safeByte = (byte) safeNumber;
        
        System.out.println("Original int value: " + safeNumber);
        System.out.println("After narrowing to byte: " + safeByte);
        
        // -------------------------------------------------------
        
        // 130 is outside the byte range.
        int largeNumber = 130;
        
        /*
         * Explicit narrowing conversion again.
         *
         * Java allows the cast, but 130 cannot be represented
         * directly by a byte because byte's maximum value is 127.
         *
         * Therefore, the resulting byte value is affected
         * by the limited 8-bit representation.
         */
        byte convertedByte = (byte) largeNumber;
        
        System.out.println();
        System.out.println("Original int value: " + largeNumber);
        System.out.println("After narrowing to byte: " + convertedByte);
    }
}
