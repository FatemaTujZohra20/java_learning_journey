package day11_Generics.BoundedGenerics;

/**
 * EXAMPLE 2: MULTIPLE BOUNDS
 * Rule: A type can have multiple bounds using the '&' operator.
 * RULE OF ORDER: If one of the bounds is a CLASS (like Number), it
 * MUST be listed first. Interfaces (like Comparable) follow after.
 * * This class requires T to be a Number AND be capable of being compared to others.
 */
public class Data<T extends Number & Comparable<T>> {
    private final T value;
    
    public Data(T value) {
        this.value = value;
    }
    
    // This is safe because T is a number
    public int getAsInt() {
        return value.intValue();
    }
    
    // This is safe because T implements Comparable
    public int compareToOther(T other) {
        return value.compareTo(other);
    }

}
