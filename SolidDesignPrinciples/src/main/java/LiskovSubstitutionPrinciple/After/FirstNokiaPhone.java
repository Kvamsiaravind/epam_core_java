package LiskovSubstitutionPrinciple.After;

public class FirstNokiaPhone implements SmsAndCaller{
    @Override
    public void sendSMS() {
        System.out.println("sending sms.. using first nokia phone.");
    }

    @Override
    public void call() {
        System.out.println("calling with first nokia phone.");
    }
}
