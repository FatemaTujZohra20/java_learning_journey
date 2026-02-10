package day11_Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// The following code is considered too much boilerplate
// This code works 100% correctly
// The problem is how much manual work you had to write for a very
// simple intention

// The actual intention (business logic):
// From the list, give me only the even numbers
// That's it. One sentence

public class WithoutStream {
    public static void main(String[] args) {

        // Step 1: Create the source data
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35);

        // Step 2: Create an empty list to store results
        List<Integer> evenNumbers = new ArrayList<>();

        // Step 3: Manually loop through the list
        for (Integer number : numbers) {

            // Step 4: Explicit condition check
            if (number % 2 == 0) {

                // Step 5: Explicitly add matching items
                evenNumbers.add(number);
            }
        }

        // Step 6: Print the result
        System.out.println(evenNumbers);
    }
}
