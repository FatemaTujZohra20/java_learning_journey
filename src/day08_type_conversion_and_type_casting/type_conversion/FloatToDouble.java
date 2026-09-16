package day08_type_conversion_and_type_casting.type_conversion;

/**
 * Demonstrates automatic widening conversion from float to double.
 * <p>
 * Conversion:
 * <p>
 * float → double
 * <p>
 * A double uses more bits than a float, so Java allows
 * this conversion automatically.
 */
public class FloatToDouble {
    public static void main(String[] args) {
        
        /*
         * Decimal literals are double by default in Java.
         *
         * Therefore, the 'f' suffix is required to explicitly
         * make this literal a float.
         */
        float temperature = 36.5f;
        
        /*
         * Automatic widening conversion:
         *
         * float → double
         *
         * No explicit cast is required.
         */
        double convertedTemperature = temperature;
        
        // Display the original float value.
        System.out.println("Original float value: " + temperature);
        
        // Display the converted double value.
        System.out.println("Converted double value: " + convertedTemperature);
    }
}
