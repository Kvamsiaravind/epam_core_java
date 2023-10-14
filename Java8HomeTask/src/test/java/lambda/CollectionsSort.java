package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSort {

    public static void sortListOfEmployeeUsingCollectionsSort(List<Employee> employeeList) {
        Collections.sort(employeeList, (firstEmp, secondEmp) -> secondEmp.getName().compareTo(firstEmp.getName()));
        System.out.println("Sorting employee list on descending names:");
        System.out.println("------------------------------------------");
        for (Employee employee : employeeList)
            System.out.println(employee);
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(12, "ram", 25000.0));
        employeeList.add(new Employee(15, "sam", 30000.0));
        employeeList.add(new Employee(76, "John", 30000.0));
        employeeList.add(new Employee(67, "Alice", 96000.0));
        employeeList.add(new Employee(54, "Bob", 45000.0));
        employeeList.add(new Employee(17, "ramana", 30000.0));

        sortListOfEmployeeUsingCollectionsSort(employeeList);
    }
}