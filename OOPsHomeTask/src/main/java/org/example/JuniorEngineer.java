package org.example;

public class JuniorEngineer extends Employee{
    private int assessmentScore;
    private String feedback;
    public JuniorEngineer(int assessmentScore, String feedback)
    {
        this.assessmentScore = assessmentScore;
        this.feedback = feedback;
    }

    public int getAssessmentScore() {
        return assessmentScore;
    }

    public void setAssessmentScore(int assessmentScore) {
        this.assessmentScore = assessmentScore;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public void printDetail() {
        System.out.println("assessmentScore :" + getAssessmentScore());
        System.out.println("feedback :" + getFeedback()+"\n");
    }

}
