package OpenClosedPrinciple.After;

public class MobileNotificationService implements NotificationService,PopupNotification{
    @Override
    public void sendOtp(String medium) {
        if(medium.equalsIgnoreCase("Mobile")){
            System.out.println("Otp sends to mobile messenger successfully.");
        }
    }

    @Override
    public void getUpdates(String medium) {
        if(medium.equalsIgnoreCase("What'sApp")){
            System.out.println(medium+" gets notification as Your PC gets update on generation.");
        }
    }

    @Override
    public void getPopupNotification(String medium) {
        if(medium.equalsIgnoreCase("mobile")){
            System.out.println("Message displayed as popup.");
        }
    }
}
