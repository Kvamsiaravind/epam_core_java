package InterfaceSegregationPrinciple;

import InterfaceSegregationPrinciple.After.GooglePay;
import InterfaceSegregationPrinciple.After.Paytm;
import InterfaceSegregationPrinciple.After.PhonePe;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Solution {
    private static final Logger logger = LogManager.getLogger(Solution.class);
    public static void main(String[] args) {


        logger.info("This is info logger message");
        GooglePay googlePay=new GooglePay();
        googlePay.payMoney();
        googlePay.getCashBackAsCreditBalance();
        googlePay.getScratchCard();
        Paytm paytm=new Paytm();
        paytm.getCashBackAsCreditBalance();
        paytm.getScratchCard();
        paytm.getCashBackPoints();
        paytm.payMoney();
        PhonePe phonePe=new PhonePe();
        phonePe.getCouponsAfterTransactions();
        phonePe.getScratchCard();
        phonePe.payMoney();
    }
}
