package SingleResponsibilityPrinciple.After;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EmailOTPSender implements OTPSender{
    private static final Logger logger = LogManager.getLogger(EmailOTPSender.class);
    @Override
    public void sendOTP(String medium) {
        if(medium.equalsIgnoreCase("email")){
            logger.info("Otp send via email");
        }
    }
}
