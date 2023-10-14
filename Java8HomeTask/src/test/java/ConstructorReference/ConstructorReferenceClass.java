package ConstructorReference;

interface EmployeeReferenceInterface {
    Employee getEmployee(String name, String accountType, double salary);
}

public class ConstructorReferenceClass {
    public static void main(String[] args) {
        EmployeeReferenceInterface employee = Employee::new;
        System.out.println(employee.getEmployee("Rama", "Salary", 35000.0).getName());
        System.out.println(employee.getEmployee("Seeta", "Merchant", 40000.0).getAccountType());
        System.out.println(employee.getEmployee("Krishna", "Business", 50000.0).getSalary());
    }
}
