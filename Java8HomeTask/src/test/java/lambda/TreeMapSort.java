package lambda;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapSort {
    public static void getReverseOrder(TreeMap<String, Integer> treemap) {
        System.out.println("Sorted the tree map by descending the values :");
        System.out.println("----------------------------------------------");
        Comparator<String> comparator = (firstValue, secondValue) -> treemap.get(secondValue).compareTo(treemap.get(firstValue));
        TreeMap<String, Integer> resultMap = new TreeMap<>(comparator);
        resultMap.putAll(treemap);
        System.out.println(resultMap);
    }

    public static void sortTreeMapByNamesDescending(TreeMap<Employee, String> treeMap) {
        System.out.println("Sorting treemap by employee names in descending order :");
        System.out.println("-------------------------------------------------------");
        Comparator<Employee> comparator = (employee1, employee2) -> employee2.getName().compareTo(employee1.getName());
        TreeMap<Employee, String> resultTreeMap = new TreeMap<>(comparator);
        resultTreeMap.putAll(treeMap);
        for (Map.Entry<Employee, String> map : resultTreeMap.entrySet())
            System.out.println(map.getKey() + " -> " + map.getValue());
    }

    public static void main(String[] args) {
        TreeMap<String, Integer> treemapOfDescVal = new TreeMap<>();
        treemapOfDescVal.put("Kumar", 9);
        treemapOfDescVal.put("Kanna", 4);
        treemapOfDescVal.put("Sana", 1);
        treemapOfDescVal.put("John", 6);
        getReverseOrder(treemapOfDescVal);


        TreeMap<Employee, String> treeMapOfDescNames = new TreeMap<>(Comparator.comparing(Employee::getName).reversed());

        treeMapOfDescNames.put(new Employee(1, "Bheem", 20000.0), "Delhi");
        treeMapOfDescNames.put(new Employee(12, "Rama", 29500.0), "UP");
        treeMapOfDescNames.put(new Employee(36, "Ratna", 45000.0), "Assam");
        treeMapOfDescNames.put(new Employee(54, "Prabha", 35000.0), "Kerela");

        System.out.println(treeMapOfDescNames);

        sortTreeMapByNamesDescending(treeMapOfDescNames);
    }
}
