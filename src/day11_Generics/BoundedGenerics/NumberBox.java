package day11_Generics.BoundedGenerics;

/**
 * EXAMPLE 1: UPPER BOUND (Single Bound)
 * The 'extends' keyword here restricts T to be a Number or any subclass
 * (Integer, Double, Float, etc.).
 */
public class NumberBox<T extends Number> {
    private final T value;
    
    public NumberBox(T value) {
        this.value = value;
    }
    
    /**
     * Because T is bounded by 'Number', we are GUARANTEED that
     * the method doubleValue() exists. Without the bound,
     * this code wouldn't compile.
     */
    public double getAsDouble() {
        return value.doubleValue();
    }
}
