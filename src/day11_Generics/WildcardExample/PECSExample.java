package day11_Generics.WildcardExample;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates PECS principle in Java Generics.
 */
public class PECSExample {
    
    /**
     * Producer: We only READ values.
     * So we use ? extends Number.
     */
    public static double sum(List<? extends Number> numbers) {
        
        double total = 0;
        
        for (Number n : numbers) {
            total += n.doubleValue();
        }
        
        return total;
    }
    
    /**
     * Consumer: We only INSERT values.
     * So we use ? super Integer.
     */
    public static void addIntegers(List<? super Integer> list) {
        
        list.add(10);
        list.add(20);
    }
    
    public static void main(String[] args) {
        
        List<Integer> intList = new ArrayList<>();
        
        // Consumer → adding values
        addIntegers(intList);
        
        // Producer → reading values
        double result = sum(intList);
        
        System.out.println("Total: " + result);
    }
}

