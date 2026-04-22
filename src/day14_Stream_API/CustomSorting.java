package day14_Stream_API;

import java.util.Comparator;
import java.util.List;

public class CustomSorting {
    public static void main (String[] args) {
        List<String> names = List.of("Fatema", "Rahim", "Karim");
        
        // Beginner Style code:
        names.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        
        // Advance Senior level writing:
//        names.stream()
//              .sorted((a, b) -> b.compareTo(a)) // descending
//              .forEach(System.out::println);
    }
}
