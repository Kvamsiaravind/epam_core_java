package org.example;

/**
 * Hello world!
 *
 */
public class SolutionTest
{
    public static void main( String[] args )
    {
        Address address = new Address(32, "kadamakuntla", "Kurnool", "Andhra pradesh", "India");
        Employee employee = new Employee(1, "Gouse", 50000, address);
        employee.printDetails();
        employee.printAddressOfEmployee();

        employee = new JuniorEngineer(88, "Excellent");
        ((JuniorEngineer) employee).printDetail();

        employee = new SoftwareEngineer("Zaggle card");
        employee.printDetails();

        employee = new Trainer("Java, .NET","Certified by EPAM Systems.");
        employee.printDetails();

        Register register=new Register();
        String inputday="Monday";
        int numOfDays=101;
        System.out.println(register.findDayOfTheWeek(inputday,numOfDays));

        DuplicateChars duplicateChars=new DuplicateChars();
        String inputString="Epam Systems Pvt Ltd";
        System.out.println("Duplicate characters in a given inputString:");
        System.out.println("--------------------------------------------");
        duplicateChars.findDuplicateChars(inputString);
    }
}
