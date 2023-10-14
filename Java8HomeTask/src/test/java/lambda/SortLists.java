package lambda;

import java.util.*;


public class SortLists {

    public static void sortIntegerListUsingLambda(List<Integer> list) {
        System.out.println("Sorting integerlist in reverse order using lambda :");
        System.out.println("---------------------------------------------------");
        Collections.sort(list, (one, two) -> two - one);
        System.out.println(list);
    }

    public static void sortEmployeeListByNameUsingLambda(List<Employee> employeeList) {
        System.out.println("Sorting employeelist by name using lambda :");
        System.out.println("-------------------------------------------");
        Collections.sort(employeeList, (employee1, employee2) -> employee1.getName().compareTo(employee2.getName()));
        for (Employee employee : employeeList)
            System.out.println(employee);
    }

    public static void secondBiggestNumber(List<Integer> list) {
        Collections.sort(list, (one, two) -> one - two);
        System.out.println("Second biggest number in the list :");
        System.out.println("-----------------------------------");
        System.out.println(list.get(list.size() - 2));
    }

    public static void main(String[] args) {

        List<Integer> listOfNumbers = new ArrayList<>();

        listOfNumbers.add(12);
        listOfNumbers.add(98);
        listOfNumbers.add(65);
        listOfNumbers.add(45);
        listOfNumbers.add(97);
        listOfNumbers.add(108);
        listOfNumbers.add(112);

        secondBiggestNumber(listOfNumbers);

        List<Integer> listOfIntegers = new ArrayList<>();

        listOfIntegers.add(19);
        listOfIntegers.add(32);
        listOfIntegers.add(86);
        listOfIntegers.add(75);
        listOfIntegers.add(1);
        listOfIntegers.add(95);
        listOfIntegers.add(81);

        sortIntegerListUsingLambda(listOfIntegers);

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(12, "ram", 25000.0));
        employeeList.add(new Employee(15, "sam", 30000.0));
        employeeList.add(new Employee(76, "John", 30000.0));
        employeeList.add(new Employee(67, "Alice", 96000.0));
        employeeList.add(new Employee(54, "Bob", 45000.0));
        employeeList.add(new Employee(17, "sam", 30000.0));

        sortEmployeeListByNameUsingLambda(employeeList);
    }
}
