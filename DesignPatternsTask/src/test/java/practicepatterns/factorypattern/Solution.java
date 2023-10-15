package practicepatterns.factorypattern;

public class Solution {
    public static void main(String[] args) {
        GetPlanFactory planFactory = new GetPlanFactory();
        String planName = "Domestic plan";
        int units = 250;
        Plan p = planFactory.getPlan(planName);
        System.out.println("Bill amount for " + planName + " is: ");
        p.getRate();
        p.getBill(units);
    }
}
