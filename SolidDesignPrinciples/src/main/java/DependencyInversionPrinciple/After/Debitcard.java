package DependencyInversionPrinciple.After;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Debitcard implements BankCard{
    private static final Logger logger = LogManager.getLogger(Debitcard.class);
    @Override
    public void doTransaction(long amount) {
        logger.info("transaction done using debitcard.");
    }
}
