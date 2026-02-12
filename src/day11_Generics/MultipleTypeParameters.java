package day11_Generics;

class Pair<K, V> {
    private K key;
    private V value;
    
    
    public Pair (K key, V value) {
        this.key = key;
        this.value = value;
    }
    
    public K getKey() {
        return key;
    }
    
    public V getValue() {
        return value;
    }
    
    
    @Override
    public String toString () {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}


public class MultipleTypeParameters {
    public static void main (String[] args) {
        Pair<Integer, String> student = new Pair<>(1, "Fatema");
        System.out.println(student.getKey());
        System.out.println(student.getValue());
        
        System.out.println(student.toString());
    }

}
