package collectionFirstTask;

import java.util.*;

public class SortListOfIntegers {

    public void getSecondBiggestElement(List<Integer> listOfIntegers) {
        Collections.sort(listOfIntegers);
        System.out.println("Second largest element in list of integers:");
        if (listOfIntegers.size() < 2) {
            System.out.println("There is no second biggest element in the list because size is less than 2");
        } else {
            System.out.println(listOfIntegers.get(listOfIntegers.size() - 2));
        }
    }

    public void sortListOfIntegersUsingComparator(List<Integer> listOfIntegers) {
        System.out.println("Reverse list using comparator:");
        System.out.println("------------------------------");
        Collections.sort(listOfIntegers, Comparator.reverseOrder());
        System.out.println(listOfIntegers);
    }

    public void sortEmployeeListByName(List<Employee> employeeList) {
        Collections.sort(employeeList, Comparator.comparing(Employee::getName));
        System.out.println("Sorted employee by name:");
        System.out.println("------------------------");
        for (Employee employee : employeeList)
            System.out.println(employee);
    }

    public static void main(String args[]) {

        SortListOfIntegers obj = new SortListOfIntegers();
        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(12);
        listOfIntegers.add(32);
        listOfIntegers.add(86);
        listOfIntegers.add(57);
        listOfIntegers.add(1);
        listOfIntegers.add(98);
        listOfIntegers.add(89);

        obj.getSecondBiggestElement(listOfIntegers);

        List<Integer> listOfIntegersForReverse = new ArrayList<>();
        listOfIntegersForReverse.add(19);
        listOfIntegersForReverse.add(32);
        listOfIntegersForReverse.add(86);
        listOfIntegersForReverse.add(75);
        listOfIntegersForReverse.add(1);
        listOfIntegersForReverse.add(95);
        listOfIntegersForReverse.add(81);

        obj.sortListOfIntegersUsingComparator(listOfIntegersForReverse);

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(12, "ram", 25000.0));
        employeeList.add(new Employee(15, "sam", 30000.0));
        employeeList.add(new Employee(76, "John", 30000.0));
        employeeList.add(new Employee(67, "Alice", 96000.0));
        employeeList.add(new Employee(54, "Bob", 45000.0));
        employeeList.add(new Employee(17, "sam", 30000.0));

        obj.sortEmployeeListByName(employeeList);
    }
}
