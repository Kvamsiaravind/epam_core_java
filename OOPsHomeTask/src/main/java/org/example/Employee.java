package org.example;

public class Employee {
    public int id,salary;
    public String name;
    Address address;
    public Employee()
    {

    }
    public Employee(int id,String name,int salary,Address address)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.address=address;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return this.id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setSalary(int salary)
    {
        this.salary=salary;
    }
    public int getSalary()
    {
        return this.salary;
    }
    public void printAddressOfEmployee()
    {
        System.out.println("Address :"+address.getFloorNumber()+" " + address.getStreetName()+"  " + address.getCityName()+"  " + address.getState()+"  " + address.getCountry());
    }

    public void printDetails() {
        System.out.println(getId());
        System.out.println(getName());
        System.out.println(getSalary());
        System.out.println();
    }
}
