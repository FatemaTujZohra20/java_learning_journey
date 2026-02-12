package day11_Stream_API;

import java.util.List;

public class CustomSorting {
    public static void main (String[] args) {
        List<String> names = List.of("Fatema", "Rahim", "Karim");
        
        // Beginner Style code:
        names.stream()
                .sorted((a, b) -> {
                    return b.compareTo(a);  // reverse comparison
                })
                .forEach(name -> {
                    System.out.println(name);
                });
        
        // Advance Senior level writing:
//        names.stream()
//              .sorted((a, b) -> b.compareTo(a)) // descending
//              .forEach(System.out::println);
    }
}
