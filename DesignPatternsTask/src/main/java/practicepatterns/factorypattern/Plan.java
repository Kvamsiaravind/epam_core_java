package practicepatterns.factorypattern;

public abstract class Plan {
    public double rate;

    abstract void getRate();

    public void getBill(int units) {
        System.out.println(units * rate);
    }
}

class DomesticPlan extends Plan {
    @Override
    public void getRate() {
        rate = 3.50;
    }
}

class CommercialPlan extends Plan {
    @Override
    public void getRate() {
        rate = 7.50;
    }
}

class InstitutionalPlan extends Plan {
    @Override
    public void getRate() {
        rate = 5.50;
    }
}

class GetPlanFactory {

    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("Domestic plan")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("Commercial plan")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("Institutional plan")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}
