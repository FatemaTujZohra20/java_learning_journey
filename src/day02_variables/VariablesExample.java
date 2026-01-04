package day02_variables;

// Day 02 - Variables & Data Types

public class VariablesExample {
    public static void main(String[] args) {
        int length = 10;
        int width = 5;

        int area = length * width;

        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);



        /* --------------------------------------------------
         * 1. PRIMITIVE DATA TYPES
         * --------------------------------------------------
         * Stored directly in stack memory
         * Faster and memory efficient
         */

        byte age = 25;              // 1 byte
        short year = 2025;          // 2 bytes
        int salary = 50000;         // 4 bytes (most commonly used)
        long people = 1_800_000_000L; // 8 bytes (use L)

        float temperature = 36.6f;  // 4 bytes (use f)
        double pi = 3.14159265359;  // 8 bytes (default for decimals)

        char grade = 'A';           // single character (Unicode)
        boolean isJavaElite = true;   // true or false

        /* --------------------------------------------------
         * 2. NON-PRIMITIVE (REFERENCE) DATA TYPES
         * --------------------------------------------------
         * Stored in heap memory
         * Variables store reference (address/location)
         */

        String name = "Fatema";     // String is a class, not primitive
        int[] marks = {88, 78, 90}; // Array (reference type)

        /* --------------------------------------------------
         * 3. TYPE INFERENCE (Java 10+)
         * --------------------------------------------------
         * Compiler infers the data type at compile time
         * Only works for local variables
         */

        var city = "Dhaka";         // inferred as String
        var score = 99;             // inferred as int

        // var cannot be used without initialization
        // var x;  // ❌ compile-time error

        /* --------------------------------------------------
         * 4. TYPE CASTING
         * --------------------------------------------------
         * Widening (Implicit) - smaller → larger (safe)
         * Narrowing (Explicit) - larger → smaller (risk of data loss)
         */

        // Widening casting
        int basicSalary = 40000;
        double updatedSalary = basicSalary; // int → double

        // Narrowing casting
        double rating = 4.8;
        int roundedRating = (int) rating;   // explicit cast

        /* --------------------------------------------------
         * 5. CONSTANTS (final keyword)
         * --------------------------------------------------
         * Value cannot be changed once assigned
         */

        final double GRAVITY = 9.8;
        // GRAVITY = 10.0; // ❌ compile-time error

        /* --------------------------------------------------
         * 6. FLOATING POINT PRECISION ISSUE
         * --------------------------------------------------
         */

        double a = 0.1;
        double b = 0.2;
        double result = a + b;

        System.out.println("0.1 + 0.2 = " + result);
        // Output may be: 0.30000000000000004

        /* --------------------------------------------------
         * OUTPUT SECTION
         * --------------------------------------------------
         */

        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Grade: " + grade);
        System.out.println("Java is fun: " + isJavaElite);
        System.out.println("Rounded Rating: " + roundedRating);
        System.out.println("Gravity Constant: " + GRAVITY);
    }
}
