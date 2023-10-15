package OpenClosedPrinciple;

import OpenClosedPrinciple.After.EmailNotificationservice;
import OpenClosedPrinciple.After.MobileNotificationService;
import OpenClosedPrinciple.After.WhatsAppNotificationService;

public class Solution {
    public static void main(String[] args) {
        WhatsAppNotificationService whatsAppNotificationService=new WhatsAppNotificationService();
        whatsAppNotificationService.sendOtp("What'sApp");
        whatsAppNotificationService.getUpdates("What'sApp");
        MobileNotificationService mobileNotificationService=new MobileNotificationService();
        mobileNotificationService.sendOtp("Mobile");
        mobileNotificationService.getPopupNotification("Mobile");
        EmailNotificationservice emailNotificationservice=new EmailNotificationservice();
        emailNotificationservice.sendOtp("email");
        emailNotificationservice.getUpdates("mobile");
    }
}
