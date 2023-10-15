package DependencyInversionPrinciple.After;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TicketBookingApp {
    BankCard bankCard;

    public TicketBookingApp(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    private static final Logger logger = LogManager.getLogger(TicketBookingApp.class);
    public void doPayment(int noOfTickets, int amount) {
        logger.info("Initialising payment ...");
        bankCard.doTransaction(amount);
    }
}
