package InterfaceSegregationPrinciple.After;

public class PhonePe implements UPIFeatures,CouponManager{
    @Override
    public void getCouponsAfterTransactions() {
        System.out.println("Getting coupons after every successful transaction.");
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
