package collectionFirstTask;

import java.util.*;

public class SortTreeset implements Comparator<Employee> {

    public int compare(Employee employee1, Employee employee2) {
        return (employee1.getName().compareTo(employee2.getName()));
    }

    public static void sortTreeSetInreverse(TreeSet<Integer> treeSet) {
        System.out.println("Treeset sorted in descending order:");
        System.out.println("-----------------------------------");
        System.out.println(treeSet.descendingSet());
    }

    public static void main(String[] args) {

        TreeSet<Integer> treesetForIntegers = new TreeSet<>();
        treesetForIntegers.add(2);
        treesetForIntegers.add(20);
        treesetForIntegers.add(10);
        treesetForIntegers.add(5);
        treesetForIntegers.add(7);
        treesetForIntegers.add(3);
        treesetForIntegers.add(3);

        sortTreeSetInreverse(treesetForIntegers);


        TreeSet<Employee> treeSet = new TreeSet<>(new SortTreeset());


        treeSet.add(new Employee(12, "John", 38000.0));
        treeSet.add(new Employee(21, "Bob", 42900.0));
        treeSet.add(new Employee(43, "Deva", 35000.0));
        treeSet.add(new Employee(35, "Kim", 50000.0));
        treeSet.add(new Employee(86, "Krish", 28000.0));
        treeSet.add(new Employee(68, "Subhani", 65000.0));

        System.out.println("Sorted the treeset by names of an employee :");
        System.out.println("--------------------------------------------");
        for (Employee employee : treeSet)
            System.out.println(employee);

    }
}
