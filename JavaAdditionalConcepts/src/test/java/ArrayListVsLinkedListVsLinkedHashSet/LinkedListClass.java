package ArrayListVsLinkedListVsLinkedHashSet;

import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        IntStream.range(1,100)
                .forEach(linkedList::add);
        System.out.println("Adding element at first :");
        linkedList.addFirst(101);
        System.out.println(linkedList);
        System.out.println("Adding element at last :");
        linkedList.addLast(11011);
        System.out.println(linkedList);
        System.out.println("Adding element at specified index :");
        linkedList.add(12,101);
        System.out.println("Element at 12th index :"+linkedList.get(12));

        linkedList.add(21);

        Collections.sort(linkedList);
        System.out.println("List after sorting :");
        System.out.println(linkedList);

        System.out.println("Check element is present in list or not :"+linkedList.contains(21));

        System.out.println("get element at first :"+linkedList.getFirst());
        System.out.println("get element at last  :"+linkedList.getLast());

        System.out.println("Size of a linked list :"+linkedList.size());
        System.out.println("Checking list is empty or not :"+linkedList.isEmpty());
        linkedList.clear();
        System.out.println("Linked list is empty because we clear the linkedlist using clear method :");
        System.out.println(linkedList);

    }
}
