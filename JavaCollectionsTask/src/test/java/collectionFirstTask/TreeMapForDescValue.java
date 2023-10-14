package collectionFirstTask;

import java.util.*;

public class TreeMapForDescValue {
    public static TreeMap<String, Integer> getReverseOrder(TreeMap<String, Integer> treemap) {
        Comparator<String> comparator = (firstValue, secondValue) -> treemap.get(secondValue).compareTo(treemap.get(firstValue));
        TreeMap<String, Integer> resultMap = new TreeMap<>(comparator);
        resultMap.putAll(treemap);
        return resultMap;
    }

    public static void main(String[] args) {
        TreeMap<String, Integer> treemapOfDescVal = new TreeMap<>();
        treemapOfDescVal.put("Kumar", 9);
        treemapOfDescVal.put("Kanna", 4);
        treemapOfDescVal.put("Sana", 1);
        treemapOfDescVal.put("John", 6);
        System.out.println("Sorted the tree map by descending the values :");
        System.out.println("----------------------------------------------");
        System.out.println(getReverseOrder(treemapOfDescVal));
    }
}
