package ArrayListVsLinkedListVsLinkedHashSet;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;


public class LinkedHashSetClass {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(5);
        linkedHashSet.add(189);
        linkedHashSet.add(91);
        linkedHashSet.add(101);
        linkedHashSet.add(78);
        linkedHashSet.add(326);

        System.out.println(linkedHashSet);
        for(Integer i:linkedHashSet)
            System.out.print(i+" ");
        System.out.println();
        System.out.println("Size of linkedhashset :"+linkedHashSet.size());

        System.out.println();
        linkedHashSet.remove(326);
        System.out.println("Check if linkedhashset contains 326 or not :"+linkedHashSet.contains(326));
        linkedHashSet.clear();
        System.out.println("Check the size of above linkedhashset after using clear() method :"+linkedHashSet.size());
    }
}
