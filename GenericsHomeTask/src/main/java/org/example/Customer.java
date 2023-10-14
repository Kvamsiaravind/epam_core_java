package org.example;

public class Customer implements Comparable<Customer>{
    private String customerName;
    private double customerSalary;

    public Customer(String customerName, double customerSalary) {
        super();
        this.customerName = customerName;
        this.customerSalary = customerSalary;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCustomerSalary() {
        return customerSalary;
    }
    @Override
    public int compareTo(Customer obj)
    {
        return Double.compare(this.customerSalary,obj.customerSalary);
    }
    @Override
    public String toString()
    {
        return "[customerName=" + customerName + ", customerSalary=" + customerSalary + "]";
    }

}
