package SingleResponsibilityPrinciple;

import SingleResponsibilityPrinciple.After.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Solution {
    private static final Logger logger = LogManager.getLogger(Solution.class);
    public static void main(String[] args) {
        ReservationService reservationService=new ReservationService();
        SearchBuses searchBuses=new SearchBuses();
        logger.info(searchBuses.search("Kurnool","Kadapa","AC"));

        ExtraFacilities extraFacilities=new ExtraFacilities();
        System.out.print("Extra features :");
        logger.info(extraFacilities.checkMoreFeatures("TV")?"Yes, available":"No, not available");
        OTPSender emailOtpSender=new EmailOTPSender();
        emailOtpSender.sendOTP("email");
        OTPSender whatsappOtpSender=new WhatsappOtpSender();
        whatsappOtpSender.sendOTP("whatsapp");


        TravelInsuranceInfo travelInsuranceInfo=new TravelInsuranceInfo();
        travelInsuranceInfo.getInsurance("accident",43);
        logger.info(reservationService.bookTicket(4));

        PrintService printBookedTicket=new PrintService();
        printBookedTicket.printTicket();
    }
}
