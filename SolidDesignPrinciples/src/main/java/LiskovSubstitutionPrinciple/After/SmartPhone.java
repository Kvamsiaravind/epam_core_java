package LiskovSubstitutionPrinciple.After;

public class SmartPhone implements SmsAndCaller,MusicPlayer,VideoPlayer{
    @Override
    public void sendSMS() {
        System.out.println("sending sms.. using smart phone.");

    }

    @Override
    public void call() {
        System.out.println("calling and alerting using smart phone.");

    }

    @Override
    public void playMusic(String fileName) {
        System.out.println("Playing this music "+fileName+" in smart phone.");

    }
    @Override
    public void playVideo(String fileName) {
        System.out.println("Playing video "+fileName+" in smart phone.");

    }

    public void playCallertune(String fileName) {
        System.out.println("Playing callertune "+fileName+", this callertune at the time of calling");
    }
}
