package day11_Generics.WildcardExample;
import java.util.ArrayList;
import java.util.List;

/**
 * WildcardExample
 *
 * Demonstrates use of wildcards:
 * - ? extends (Producer)
 * - ? super (Consumer)
 *
 * Concept Covered:
 * - Upper bounded wildcard
 * - Lower bounded wildcard
 * - PECS principle
 */
public class WildcardExample {
    
    /**
     * Reads numbers (Producer → extends)
     */
    public static double sum(List<? extends Number> list) {
        double total = 0;
        
        for (Number n : list) {
            total += n.doubleValue();
        }
        
        return total;
    }
    
    /**
     * Adds integers (Consumer → super)
     */
    public static void addIntegers(List<? super Integer> list) {
        list.add(100);
        list.add(200);
    }
    
    public static void main(String[] args) {
        
        List<Integer> intList = new ArrayList<>();
        addIntegers(intList);
        
        System.out.println("Sum: " + sum(intList));
    }
}

