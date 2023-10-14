package ComparatorVsComparable;

import ComparatorComparable.Employee;
import ComparatorComparable.NameComparator;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorImplementation {
    public static void main(String[] args) {
        Employee student1=new Employee(1,"ram",16);
        Employee student2=new Employee(12,"seetha",15);
        Employee student3=new Employee(5,"lakshmana",14);

        List<Employee> studentList= Arrays.asList(student1,student2,student3);
        Collections.sort(studentList,new NameComparator());
        for(Employee student:studentList){
            System.out.println(student);
        }
    }
}
