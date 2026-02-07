package day10_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        // Generics with List
        List<Integer> values = new ArrayList<>();
        values.add(404);
        values.add(908);
        values.add(639);
        values.add(265);

//        Comparator<Integer> c = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer i, Integer j) {
//                if (i%10>j%10)
//                    return 1;
//                else
//                    return -1;
//            }
//        };

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                return i%10>j%10?1:-1;      // Ternary Operator
            }
        };


        Collections.sort(values, c);

        for (Integer o : values) {
            System.out.println(o);
        }
    }

}
