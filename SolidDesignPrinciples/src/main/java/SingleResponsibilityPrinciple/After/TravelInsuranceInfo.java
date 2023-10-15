package SingleResponsibilityPrinciple.After;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TravelInsuranceInfo {
    private static final Logger logger = LogManager.getLogger(TravelInsuranceInfo.class);
    public void getInsurance(String cause,int ticketid){
        if(cause.equals("accident")){
            logger.info("Insurance sanctioned for personal accident.");
        }
        if(cause.equals("loss of luggage")){
            logger.info("Insurance sanctioned for loss of bag caused by Bus department.");
        }
        if(cause.equals("not available bus")){
            logger.info("Insurance get sanctioned for doesn't provide bus at reserved time and date causing long trouble in engines.");
        }
    }
}
