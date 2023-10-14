package ComparatorComparable;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
    public int compare(Employee student1, Employee student2)
    {
        return student1.name.compareTo(student2.name);
    }
}