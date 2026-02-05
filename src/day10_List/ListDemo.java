package day10_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // List without Generics
        List values = new ArrayList<>();
        values.add(1);
        values.add(3);
        values.add(5);
        values.add(1, 6);

//        Iterator it = values.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

        // Normal for loop
//        for (int i = 0; i < values.size(); i++) {
//            System.out.println(values.get(i));
//        }

        // enhanced for loop
        for (Object o : values) {
            System.out.println(o);
        }

    }
}
