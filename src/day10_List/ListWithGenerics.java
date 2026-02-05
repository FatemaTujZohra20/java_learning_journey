package day10_List;

import java.util.ArrayList;
import java.util.List;

public class ListWithGenerics {
    public static void main(String[] args) {
        // Generics with List
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(3);
        values.add(5);
//        values.add(1, 6);

        for (Integer o : values) {
            System.out.println(o);
        }

    }
}
