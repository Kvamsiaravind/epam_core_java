package SingleResponsibilityPrinciple.After;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WhatsappOtpSender implements OTPSender{
    private static final Logger logger = LogManager.getLogger(WhatsappOtpSender.class);

    @Override
    public void sendOTP(String medium) {
        if(medium.equalsIgnoreCase("whatsapp")){
            logger.info("Otp send via whatsapp");
        }
    }
}
