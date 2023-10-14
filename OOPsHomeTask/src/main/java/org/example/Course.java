package org.example;

public class Course {
    private int courseId,duration;
    private String courseName;
    Course(int courseId,String courseName,int duration)
    {
        this.courseId=courseId;
        this.courseName=courseName;
        this.duration=duration;
    }
    public void setCourseId(int courseId)
    {
        this.courseId=courseId;
    }
    public int getCourseId()
    {
        return this.courseId;
    }
    public void setCourseName(String courseName)
    {
        this.courseName=courseName;
    }
    public String getCourseName()
    {
        return this.courseName;
    }
    public void setDuration(int duration)
    {
        this.duration=duration;
    }
    public int getDuration()
    {
        return this.duration;
    }
    public void printDetails()
    {
        System.out.println("Course id   :"+courseId);
        System.out.println("Course name :"+courseName);
        System.out.println("Course duration:"+duration+"\n");
    }
}
