package ImplementingHashClasses;

import java.util.HashSet;
import java.util.Set;

public class HashSetClass {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(9);
        set.add(23);
        set.add(97);
        set.add(56);
        set.add(9);
        System.out.println("printing elements in a set");
        System.out.println(set);
        System.out.println(set.size());
        System.out.println("Checking element is present or not :" + set.contains(23));
        System.out.println("Checking set is empty or not :" + set.isEmpty());
        System.out.println("Removing element from set using remove() :");
        System.out.println(set.remove(9));
        System.out.println(set);
        set.clear();
        System.out.println(set);
    }
}
