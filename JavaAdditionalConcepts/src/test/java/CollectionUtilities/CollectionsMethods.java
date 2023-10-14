package CollectionUtilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class CollectionsMethods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        IntStream.range(1, 11)
                .forEach(list::add);
        System.out.println("Implementing Collections :");
        System.out.println("--------------------------");
        System.out.println("After creation and adding elements to list");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println("After shuffling list :");
        System.out.println(list);
        System.out.println("Min and max elements in a list :");
        System.out.println("Min element in list :" + Collections.min(list) + "\n" + "Max element in list :" + Collections.max(list));
        System.out.println("After performing sorting on a list :");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Reversing a list :");
        Collections.reverse(list);
        System.out.println(list);
    }
}
