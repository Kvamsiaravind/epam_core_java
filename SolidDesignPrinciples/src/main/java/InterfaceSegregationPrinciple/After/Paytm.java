package InterfaceSegregationPrinciple.After;

public class Paytm implements UPIFeatures,CashBackPoints,CashBackBalance{
    @Override
    public void getCashBackAsCreditBalance() {
        System.out.println("After done payment using paytm getting cash back into wallet.");
    }

    @Override
    public void getCashBackPoints() {
        System.out.println("getting cashback points after successfull transaction.");
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
