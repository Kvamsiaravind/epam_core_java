package ArrayListVsLinkedListVsLinkedHashSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 5, 66, 6, 6, 555, 72, 292);
        System.out.println("List containing following elements :");
        System.out.println(list);
        System.out.println("list containing no.of elements :" + list.size());

        System.out.println(list);
        System.out.println("To check whether the element is present in list or not :" + list.contains(66));
        System.out.println("Sorting list using sort() method :");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("The element present at index 2 is :" + list.get(2));
    }
}
