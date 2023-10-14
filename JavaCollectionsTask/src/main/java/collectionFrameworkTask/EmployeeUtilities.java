package collectionFrameworkTask;

import java.util.*;

public class EmployeeUtilities {
    public void getMaleAndFemaleCount(List<Employee> employeeList) {
        int maleCount = 0, femaleCount = 0;
        for (Employee employee : employeeList) {
            if (employee.getGender().equals("Male"))
                maleCount = maleCount + 1;
            else
                femaleCount = femaleCount + 1;
        }
        System.out.println("Male count in organization :" + maleCount);
        System.out.println("Female count in organization :" + femaleCount);
    }

    public void getAllDepartments(List<Employee> employeeList) {
        Set<String> setOfDepartments = new HashSet<>();
        for (Employee employee : employeeList) {
            setOfDepartments.add(employee.getDepartment());
        }
        System.out.println("Departments in a organization:");
        System.out.println("------------------------------");
        System.out.println(setOfDepartments);
    }

    public void getAverageAgeOfMaleAndFemale(List<Employee> employeeList) {
        int sumOfMaleAge = 0, sumOfFemaleAge = 0;
        int maleCount = 0, femaleCount = 0;
        for (Employee employee : employeeList) {
            if (employee.getGender().equals("Male")) {
                maleCount = maleCount + 1;
                sumOfMaleAge = sumOfMaleAge + employee.getAge();
            } else {
                femaleCount = femaleCount + 1;
                sumOfFemaleAge = sumOfFemaleAge + employee.getAge();
            }
        }
        System.out.println("Average age of male employees:" + sumOfMaleAge / maleCount);
        System.out.println("Average age of female employees:" + sumOfFemaleAge / femaleCount);
    }

    public void findHighestPaidEmployeeDetails(List<Employee> employeeList) {
        String highestPaidEmployee = "";
        Double salary = Double.MIN_VALUE;
        for (Employee employee : employeeList) {
            if (employee.getSalary() > salary) {
                salary = employee.getSalary();
                highestPaidEmployee = employee.toString();
            }
        }
        System.out.println("Highest paid employee in the organization:");
        System.out.println("------------------------------------------");
        System.out.println(highestPaidEmployee);
    }

    public void getNamesOfAllEmployeesJoinedAfter_2015(List<Employee> employeeList) {
        List<String> listOfEmployeeNames = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getYearOfJoining() > 2015)
                listOfEmployeeNames.add(employee.getName());
        }
        System.out.println("All employee names who joined after 2015:");
        System.out.println(listOfEmployeeNames);
    }

    public void getCountOfEmployeesInEachDept(List<Employee> employeeList) {
        Map<String, Integer> mapOfDepartmentCount = new HashMap<>();
        for (Employee employee : employeeList) {
            if (mapOfDepartmentCount.containsKey(employee.getDepartment())) {
                mapOfDepartmentCount.put(employee.getDepartment(), mapOfDepartmentCount.get(employee.getDepartment()) + 1);
            } else {
                mapOfDepartmentCount.put(employee.getDepartment(), 1);
            }
        }
        System.out.println("Employees in each department:");
        System.out.println("-----------------------------");
        for (Map.Entry<String, Integer> map : mapOfDepartmentCount.entrySet())
            System.out.println(map.getKey() + " = " + map.getValue());
    }

    public void getAvgSalOfEachDept(List<Employee> employeeList) {
        Map<String, Double> mapOfSal = new HashMap<>();
        Map<String, Integer> mapOfDepartmentCount = new HashMap<>();
        List<Integer> listOfEmplCount = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (mapOfDepartmentCount.containsKey(employee.getDepartment())) {
                mapOfDepartmentCount.put(employee.getDepartment(), mapOfDepartmentCount.get(employee.getDepartment()) + 1);
                mapOfSal.put(employee.getDepartment(), mapOfSal.get(employee.getDepartment()) + employee.getSalary());
            } else {
                mapOfDepartmentCount.put(employee.getDepartment(), 1);
                mapOfSal.put(employee.getDepartment(), 0.0);
            }
        }
        for (Map.Entry<String, Integer> map : mapOfDepartmentCount.entrySet()) {
            listOfEmplCount.add(map.getValue());
        }
        System.out.println("Average salary in each department :");
        System.out.println("-----------------------------------");
        int index = 0;
        for (Map.Entry<String, Double> map : mapOfSal.entrySet()) {
            System.out.println(map.getKey() + " = " + map.getValue() / (Double.valueOf(listOfEmplCount.get(index))));
            index = index + 1;
        }
    }

    public void getYoungMaleEmpInPD(List<Employee> employeeList) {
        String youngMaleEmpInPD = "";
        int ageOfYoungMaleEmp = Integer.MAX_VALUE;
        for (Employee employee : employeeList) {
            if (employee.getDepartment().equals("Product Development") && employee.getGender().equals("Male") && ageOfYoungMaleEmp > employee.getAge()) {
                    ageOfYoungMaleEmp = employee.getAge();
                    youngMaleEmpInPD = employee.toString();
            }
        }
        System.out.println("Youngest male employee in the product development :");
        System.out.println("---------------------------------------------------");
        System.out.println(youngMaleEmpInPD);
    }

    public void getMostWorkingEmp(List<Employee> employeeList) {
        String nameOfMostWorkingEmp = "";
        int expeirence = Integer.MIN_VALUE;
        for (Employee employee : employeeList) {
            if (employee.getYearOfJoining() > expeirence) {
                expeirence = employee.getYearOfJoining();
                nameOfMostWorkingEmp = employee.getName();
            }
        }
        System.out.println(nameOfMostWorkingEmp + " having most expeirence in the organization");
    }

    public void findCountOfMandFInSandM(List<Employee> employeeList) {
        int maleCount = 0, femaleCount = 0;
        for (Employee employee : employeeList) {
            if (employee.getDepartment().equals("Sales And Marketing")) {
                if (employee.getGender().equals("Male")) {
                    maleCount = maleCount + 1;
                } else {
                    femaleCount = femaleCount + 1;
                }
            }
        }
        System.out.println("Male count in Sales and Marketing :" + maleCount);
        System.out.println("Female count in Sales and Marketing :" + femaleCount);
    }

    public void findAvgOfMaleAndFemaleSal(List<Employee> employeeList) {
        int maleCount = 0, femaleCount = 0;
        Double totalMaleSal = 0.0, totalFemaleSal = 0.0;
        for (Employee employee : employeeList) {
            if (employee.getGender().equals("Male")) {
                maleCount = maleCount + 1;
                totalMaleSal = totalMaleSal + employee.getSalary();
            } else {
                femaleCount = femaleCount + 1;
                totalFemaleSal = totalFemaleSal + employee.getSalary();
            }
        }
        System.out.println("Average male salary :" + totalMaleSal / (Double.valueOf(maleCount)));
        System.out.println("Average female salary :" + totalFemaleSal / (Double.valueOf(femaleCount)));
    }

    public void getListOfAllEmpInEachDept(List<Employee> employeeList) {
        Map<String, List<String>> mapOfDeptAndEmpNames = new HashMap<>();
        for (Employee employee : employeeList) {
            if (mapOfDeptAndEmpNames.containsKey(employee.getDepartment())) {
                List<String> listOfEmployeeName = mapOfDeptAndEmpNames.get(employee.getDepartment());
                listOfEmployeeName.add(employee.getName());
                mapOfDeptAndEmpNames.put(employee.getDepartment(), listOfEmployeeName);
            } else {
                List<String> list = new ArrayList<>();
                mapOfDeptAndEmpNames.put(employee.getDepartment(), list);
            }
        }
        System.out.println("Employee names in each dept:");
        System.out.println("----------------------------");
        for (Map.Entry<String, List<String>> map : mapOfDeptAndEmpNames.entrySet()) {
            System.out.println(map.getKey() + " -> " + map.getValue());
        }
    }

    public void getAvgAndTotSal(List<Employee> employeeList) {
        Double totSal = 0.0;
        for (Employee employee : employeeList) {
            totSal = totSal + employee.getSalary();
        }
        System.out.println("Total salary in an organization :" + totSal);
        System.out.println("Average salary in an organization :" + totSal / (Double.valueOf(employeeList.size())));
    }

    public void divideEmpOnAge(List<Employee> employeeList) {
        List<Employee> listOfEmpYoung_25 = new ArrayList<>();
        List<Employee> listOfEmpOld_25 = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getAge() <= 25) {
                listOfEmpYoung_25.add(employee);
            } else {
                listOfEmpOld_25.add(employee);
            }
        }
        System.out.println("People having age younger or equal to 25:");
        System.out.println("-----------------------------------------");
        for (Employee employee : listOfEmpYoung_25) {
            System.out.println(employee);
        }
        System.out.println("People having age older than 25:");
        System.out.println("--------------------------------");
        for (Employee employee : listOfEmpOld_25) {
            System.out.println(employee);
        }
    }

    public void getOldestEmployee(List<Employee> employeeList) {
        int ageOfOldEmp = Integer.MIN_VALUE;
        String deptName = "", empName = "";
        for (Employee employee : employeeList) {
            if (ageOfOldEmp < employee.getAge()) {
                ageOfOldEmp = employee.getAge();
                deptName = employee.getDepartment();
                empName = employee.getName();
            }
        }
        System.out.println(empName + " is the oldest employee.");
        System.out.println("He is " + ageOfOldEmp + " years old.");
        System.out.println("He belongs to " + deptName + " department.");
    }
}
