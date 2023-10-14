package ConstructorReference;

public class Employee {
    String name;
    String accountType;
    double salary;

    public Employee(String name, String accountType, double salary) {
        this.name = name;
        this.accountType = accountType;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ConstructorReference.Employee{" +
                "name='" + name + '\'' +
                ", accountType='" + accountType + '\'' +
                ", salary=" + salary +
                '}';
    }
}
