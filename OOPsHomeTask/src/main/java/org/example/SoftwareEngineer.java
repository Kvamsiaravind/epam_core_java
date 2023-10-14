package org.example;

public class SoftwareEngineer extends Employee{
    private String projectName;
    public void setProjectName(String projectName) { this.projectName=projectName; }
    public String getProjectName() { return this.projectName; }
    SoftwareEngineer(String projectName)
    {
        this.projectName=projectName;
    }
    @Override
    public void printDetails()
    {
        System.out.println("Project title:  "+projectName+"\n");
    }
}
