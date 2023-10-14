package ComparatorComparable;

public class Employee implements Comparable<Employee> {
    int id,age;
    String name;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public int compareTo(Employee employee){
        return this.name.compareTo(employee.name);
    }
}

