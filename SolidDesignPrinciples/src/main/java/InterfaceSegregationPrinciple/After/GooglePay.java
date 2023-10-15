package InterfaceSegregationPrinciple.After;

public class GooglePay implements UPIFeatures,CashBackBalance{
    @Override
    public void getCashBackAsCreditBalance() {
        System.out.println("After done payment using google pay getting cash back into account.");
    }

    @Override
    public void payMoney() {
        System.out.println("paid money..");
    }

    @Override
    public void getScratchCard() {
        System.out.println("getting scratch card after doing payment successfully.");
    }
}
