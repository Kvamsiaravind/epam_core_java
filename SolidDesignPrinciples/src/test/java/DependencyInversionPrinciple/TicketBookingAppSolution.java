package DependencyInversionPrinciple;

import DependencyInversionPrinciple.After.BankCard;
import DependencyInversionPrinciple.After.Debitcard;
import DependencyInversionPrinciple.After.TicketBookingApp;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class TicketBookingAppSolution {
    private static final Logger logger = LogManager.getLogger(TicketBookingAppSolution.class);
    public static void main(String[] args) {
        BankCard bankCard=new Debitcard();
        TicketBookingApp ticketBookingApp=new TicketBookingApp(bankCard);
        ticketBookingApp.doPayment(4,4000);
        logger.debug("This is debug message in DIP principle ");
        logger.info("This is info message in DIP principle ");
        logger.warn("This is warn message in DIP principle ");
        logger.fatal("This is fatal message in DIP principle ");
        logger.error("This is error message in DIP principle ");
    }
}
