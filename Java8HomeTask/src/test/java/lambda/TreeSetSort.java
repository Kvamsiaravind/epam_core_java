package lambda;

import java.util.Comparator;
import java.util.TreeSet;


public class TreeSetSort {
    public static void sortTreesetNumbersUsingLambda(TreeSet<Integer> treeSet) {
        System.out.println("Sorting treeset numbers using lambda functions :");
        System.out.println("------------------------------------------------");
        TreeSet<Integer> resultTreeSet = new TreeSet<>((one, two) -> two - one);
        resultTreeSet.addAll(treeSet);
        System.out.println(resultTreeSet);
    }

    public static void sortTreesetEmployeesUsingLambda(TreeSet<Employee> employeeTreeSet) {
        System.out.println("Sorting treeset employee using lambda functions :");
        System.out.println("-------------------------------------------------");
        TreeSet<Employee> resultEmployeeTreeSet = new TreeSet<>((employee1, employee2) -> employee1.getName().compareTo(employee2.getName()));
        resultEmployeeTreeSet.addAll(employeeTreeSet);
        for (Employee employee : resultEmployeeTreeSet)
            System.out.println(employee);
    }

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(12);
        treeSet.add(18);
        treeSet.add(73);
        treeSet.add(9);
        treeSet.add(65);
        treeSet.add(43);
        treeSet.add(28);
        treeSet.add(54);

        sortTreesetNumbersUsingLambda(treeSet);


        TreeSet<Employee> employeeTreeSet = new TreeSet<>((employee1, employee2) -> employee1.getName().compareTo(employee2.getName()));

        employeeTreeSet.add(new Employee(12, "John", 38000.0));
        employeeTreeSet.add(new Employee(21, "Bob", 42900.0));
        employeeTreeSet.add(new Employee(43, "Deva", 35000.0));
        employeeTreeSet.add(new Employee(35, "Kim", 50000.0));
        employeeTreeSet.add(new Employee(86, "Krish", 28000.0));
        employeeTreeSet.add(new Employee(68, "Subhani", 65000.0));

        sortTreesetEmployeesUsingLambda(employeeTreeSet);
    }

}
