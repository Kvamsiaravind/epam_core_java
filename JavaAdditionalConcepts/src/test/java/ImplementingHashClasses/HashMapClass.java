package ImplementingHashClasses;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("red", 1);
        map.put("green", 2);
        map.put("yellow", 4);
        map.put("violet", 8);
        System.out.println(map);
        System.out.println("size of a map:" + map.size());
        System.out.println("Changing value for 'red' :");
        map.replace("red", 10);
        System.out.println(map);
        System.out.println("print map using entrySet() :");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " -> " + m.getValue());
        }
        System.out.println("Checking map is emplty or not :" + map.isEmpty());
        map.clear();

        System.out.println("Size of map :" + map.size());
    }
}
