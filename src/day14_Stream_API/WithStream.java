package day14_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WithStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        // Stream pipeline:
        // 1. stream() -> convert collection to stream
        // 2. filter() -> intermediate operation
        // 3. collect() -> terminal operation
        List<Integer> evenNumbers = numbers.stream()
                                            .filter(num -> num % 2 == 0)
                                            .collect(Collectors.toList());

        System.out.println(evenNumbers);

    }
}
