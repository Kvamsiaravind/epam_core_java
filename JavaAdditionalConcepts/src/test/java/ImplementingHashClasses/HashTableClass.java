package ImplementingHashClasses;


import java.util.*;


public class HashTableClass {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "ram");
        hashtable.put(1, "ramana");
        hashtable.put(2, "seetha");
        hashtable.put(39, "arjuna");
        hashtable.put(41, "Krishna");
        System.out.println(" Hashtable ");
        System.out.println("-----------");
        for (Map.Entry<Integer, String> m : hashtable.entrySet()) {
            System.out.println(m.getKey() + " -> " + m.getValue());
        }
        System.out.println("Iterating Hashtable using enumeration :");
        System.out.println("---------------------------------------");
        Enumeration<Integer> e = hashtable.keys();
        while (e.hasMoreElements()) {
            Integer key = e.nextElement();
            System.out.println(key + " = " + hashtable.get(key));
        }
        System.out.println("Size of Hashtable is :" + hashtable.size());
        hashtable.remove(39);
        System.out.println(hashtable);
        Collection list = hashtable.values();
        System.out.println("Collecting values in hashtable :");
        System.out.println(list);
    }
}
