package OpenClosedPrinciple.After;

public class WhatsAppNotificationService implements NotificationService{
    @Override
    public void sendOtp(String medium) {
        if(medium.equalsIgnoreCase("What'sApp")){
            System.out.println("Otp sends to what's app successfully.");
        }
    }

    @Override
    public void getUpdates(String medium) {
        if(medium.equalsIgnoreCase("What'sApp")){
            System.out.println(medium+" gets notification as Your PC gets update on generation.");
        }
    }
}
