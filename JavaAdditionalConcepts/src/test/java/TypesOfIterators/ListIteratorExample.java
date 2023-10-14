package TypesOfIterators;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        IntStream.range(11, 21)
                .forEach(list::add);
        System.out.println("list before using list iterator :");
        System.out.println("---------------------------------");
        System.out.println(list);
        System.out.println("list after using list iterator :");
        System.out.println("--------------------------------");
        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()) {
            int value = (int) iterator.next();
            System.out.print(value + " ");
            if (value % 3 == 0) {
                iterator.add(value);
            }
        }
        System.out.println();
        System.out.println(list);
    }
}
