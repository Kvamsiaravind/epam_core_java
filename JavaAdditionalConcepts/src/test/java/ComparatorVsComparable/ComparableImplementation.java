package ComparatorVsComparable;

import ComparatorComparable.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableImplementation {
    public static void main(String[] args) {
        Employee employee1=new Employee(101,"ramana",35);
        Employee employee2=new Employee(102,"arjuna",38);
        Employee employee3=new Employee(110,"krishna",40);

        List<Employee> employeeList= Arrays.asList(employee1,employee2,employee3);
        Collections.sort(employeeList);
        for(Employee employee:employeeList)
            System.out.println(employee);
    }
}
