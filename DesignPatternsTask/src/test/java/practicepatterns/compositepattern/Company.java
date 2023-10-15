package practicepatterns.compositepattern;

import practicepatterns.compositepattern.CompanyDirectory;
import practicepatterns.compositepattern.Developer;
import practicepatterns.compositepattern.Manager;

public class Company {
    public static void main(String[] args) {
        Developer dev1 = new Developer(100, "Gouse", "Pro Developer");
        Developer dev2 = new Developer(101, "Dharma", "Developer");
        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Manager man1 = new Manager(200, "Satya", "SEO Manager");
        Manager man2 = new Manager(201, "Vishnu", "Gouse's Manager");

        CompanyDirectory accDirectory = new CompanyDirectory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);
        directory.showEmployeeDetails();
    }
}
