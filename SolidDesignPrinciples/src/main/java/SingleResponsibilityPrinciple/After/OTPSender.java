package SingleResponsibilityPrinciple.After;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface OTPSender {
    public void sendOTP(String medium);
}
