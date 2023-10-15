package SingleResponsibilityPrinciple.After;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrintService {
    private static final Logger logger = LogManager.getLogger(PrintService.class);
    public void printTicket() {
        logger.info("soft copy is enough.");
    }
}
