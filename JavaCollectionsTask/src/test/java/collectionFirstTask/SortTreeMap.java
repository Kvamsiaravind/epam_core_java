package collectionFirstTask;

import java.util.*;

public class SortTreeMap implements Comparator<Employee> {
    public int compare(Employee employee1, Employee employee2) {
        return employee1.getName().compareTo(employee2.getName());
    }

    public static void main(String[] args) {
        TreeMap<Employee, String> treeMap = new TreeMap<>(new SortTreeMap());

        treeMap.put(new Employee(1, "Bheem", 20000.0), "Delhi");
        treeMap.put(new Employee(12, "Rama", 29500.0), "UP");
        treeMap.put(new Employee(36, "Ratna", 45000.0), "Assam");
        treeMap.put(new Employee(54, "Prabha", 35000.0), "Kerela");
        System.out.println("Sorting treemap by employee names in descending order :");
        System.out.println("-----------------------------------");
        System.out.println(treeMap);

    }
}
