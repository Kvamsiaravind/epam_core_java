package OpenClosedPrinciple.After;

public class EmailNotificationservice implements NotificationService {
    @Override
    public void sendOtp(String medium) {
        if(medium.equalsIgnoreCase("email")){
            System.out.println("Otp sends to email successfully.");
        }
    }
    @Override
    public void getUpdates(String medium) {
        if(medium.equalsIgnoreCase("email")){
            System.out.println(medium+" gets notification as Your PC gets update on generation.");
        }
        if(medium.equalsIgnoreCase("mobile")){
            System.out.println(medium+" gets notification as Your PC gets update on generation.");
        }

    }
}
