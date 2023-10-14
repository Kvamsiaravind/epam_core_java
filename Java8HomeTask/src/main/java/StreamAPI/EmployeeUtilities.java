package StreamAPI;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeUtilities {
    public void getMaleAndFemaleCount(List<Employee> employeeList) {
        System.out.println("Male count :" + employeeList.stream().filter(employee -> employee.getGender().equals("Male")).count());
        System.out.println("Female count :" + employeeList.stream().filter(employee -> employee.getGender().equals("Female")).count());
    }

    public void getDeptNames(List<Employee> employeeList) {
        System.out.println("Department names :");
        System.out.println("------------------");
        employeeList.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);
    }

    public void getAvgAgeOfMaleAndFemale(List<Employee> employeeList) {
        System.out.println("Average age of male and female employee :");
        System.out.println("-----------------------------------------");
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge))));
    }

    public void getHighestPaidEmployee(List<Employee> employeeList) {
        System.out.println("Highest paid employee in an organization :");
        System.out.println("------------------------------------------");
        System.out.println(employeeList.stream().max(Comparator.comparing(Employee::getSalary)));
    }

    public void getEmpNamesJoinedAfter_2015(List<Employee> employeeList) {
        System.out.println("Employees who joined after 2015 :");
        System.out.println("---------------------------------");
        employeeList.stream().filter(employee -> employee.getYearOfJoining() > 2015)
                .forEach(employee -> employee.getName());
    }

    public void getCountOfEmpInDept(List<Employee> employeeList) {
        System.out.println("Employees count in each department :");
        System.out.println("------------------------------------");
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())));
    }

    public void getAvgSalaryInDept(List<Employee> employeeList) {
        System.out.println("Average salary in each department :");
        System.out.println("------------------------------------");
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary))));
    }

    public void getYoungMaleEmpInPD(List<Employee> employeeList) {
        System.out.println("Young age employee in Production Development department :");
        System.out.println("-----------------------------------------------------------");
        System.out.println(employeeList.stream().filter(employee -> employee.getDepartment().equals("Product Development"))
                .filter(employee -> employee.getGender().equals("Male"))
                .min(Comparator.comparingInt(Employee::getAge)));
    }

    public void getMostExpeireincingemployee(List<Employee> employeeList) {
        System.out.println("Most working expeirence employee in an organization:");
        System.out.println("-------------------------------------------");
        System.out.println(employeeList.stream()
                .min(Comparator.comparingInt(Employee::getYearOfJoining)));
    }

    public void getMaleAndFemaleInSM(List<Employee> employeeList) {
        System.out.println("Male and female count in Sales and marketing:");
        System.out.println("---------------------------------------------");
        System.out.println(employeeList.stream().filter(employee -> employee.getDepartment().equals("Sales And Marketing"))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())));
    }

    public void getAvgSalOfMaleAndFemale(List<Employee> employeeList) {
        System.out.println("Average salary of male and female employee :");
        System.out.println("--------------------------------------------");
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary))));
    }

    public void getEachEmpInDept(List<Employee> employeeList) {
        System.out.println("List of employees in each dept:");
        System.out.println("-------------------------------");
        Map<String, List<Employee>> mapOfEmpList = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        for (Map.Entry<String, List<Employee>> map : mapOfEmpList.entrySet()) {
            System.out.println(map.getKey());
            System.out.println("-------------");
            System.out.println(map.getValue());
        }
        System.out.println();
    }

    public void getAvgAndTotalSal(List<Employee> employeeList) {
        double totalSal = employeeList.stream().collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println("Total salary in an organization     :" + totalSal);
        System.out.println("Average salary in an organization   :" + totalSal / Double.valueOf(employeeList.size()));
    }

    public void getEmpAge_25(List<Employee> employeeList) {
        Map<Boolean, List<Employee>> map = employeeList.stream().collect(Collectors.partitioningBy(employee -> employee.getAge() <= 25));
        for (Map.Entry<Boolean, List<Employee>> employeesListByAge : map.entrySet()) {
            if (employeesListByAge.getKey() == true) {
                System.out.println("Employee list age less than or equal to 25  :");
                System.out.println("---------------------------------------------");
                for (Employee employee : employeesListByAge.getValue()) {
                    System.out.println(employee);
                }
            } else {
                System.out.println("ConstructorReference.Employee list age greater than or equal to 25  :");
                System.out.println("------------------------------------------------");
                for (Employee employee : employeesListByAge.getValue()) {
                    System.out.println(employee);

                }
            }
        }
    }

    public void getOldestEmp(List<Employee> employeeList) {
        Optional<Employee> employee = employeeList.stream()
                .max(Comparator.comparingInt(Employee::getAge));
        System.out.println("Oldest employee details in organization :");
        System.out.println("-----------------------------------------");
        System.out.println("Oldest employee name    :" + employee.get().getName());
        System.out.println("His age is :" + employee.get().getAge());
        System.out.println("He belongs to :" + employee.get().getDepartment());
    }
}

