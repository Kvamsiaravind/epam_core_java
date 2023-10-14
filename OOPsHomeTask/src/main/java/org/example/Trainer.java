package org.example;

public class Trainer extends Employee{
    private String skills;
    private String certifications;
    public void setSkills(String skills) { this.skills=skills; }
    public String getSkills() { return this.skills; }
    public void getSkills(String certifications) { this.certifications=certifications; }
    public String getCertifications() { return this.certifications; }
    Trainer(String skills,String certifications)
    {
        this.skills=skills;
        this.certifications=certifications;
    }
    public void printDetails()
    {
        System.out.println("Skills          :"+skills);
        System.out.println("Certifications  :"+certifications+"\n");
    }
}
