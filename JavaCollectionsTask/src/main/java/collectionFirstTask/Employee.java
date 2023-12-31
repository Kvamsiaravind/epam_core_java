package collectionFirstTask;

public class Employee {
    String name;
    int id;
    double salary;

    public Employee(int id, String name, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "[" +
                "id=" + id +
                " name=" + name +
                ", salary=" + salary +
                ']';
    }
}
