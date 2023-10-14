package TypesOfIterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class JavaIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        IntStream.range(1, 11)
                .forEach(list::add);
        System.out.println("list before using java iterator :");
        System.out.println("---------------------------------");
        System.out.println(list);
        System.out.println("list after using java iterator :");
        System.out.println("--------------------------------");
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            int value = itr.next();
            System.out.print(value + " ");
            if (value % 5 == 0)
                itr.remove();
        }
        System.out.println();
        System.out.println(list);
    }
}
