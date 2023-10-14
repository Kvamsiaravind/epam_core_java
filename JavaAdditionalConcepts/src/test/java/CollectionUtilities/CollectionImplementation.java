package CollectionUtilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionImplementation {
    public static void main(String[] args) {
        String s = "Java,C,Python,.net,Kotlin,Angular,react";
        String arr[] = s.split(",");
        List<String> list = new ArrayList<>();
        for (String name : arr)
            list.add(name);
        System.out.println("Implementing Collection interface :");
        System.out.println("-----------------------------------");
        System.out.println(list);
        System.out.println("Size of above list :" + list.size());
        list.remove("Java");
        System.out.println("After removing 'Java' from above list :");
        System.out.println(list);
        System.out.println("Check if list is empty or not :");
        System.out.println(list.isEmpty() ? "list is empty" : "List containing elements");
        list.clear();
        System.out.println("After performing clear() operation :");
        System.out.println(list.isEmpty() ? "list is empty" : "List containing elements");
    }
}
