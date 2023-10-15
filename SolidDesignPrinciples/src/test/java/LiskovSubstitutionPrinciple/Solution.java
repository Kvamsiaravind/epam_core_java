package LiskovSubstitutionPrinciple;

import LiskovSubstitutionPrinciple.After.FirstNokiaPhone;
import LiskovSubstitutionPrinciple.After.Ipod;
import LiskovSubstitutionPrinciple.After.SmartPhone;

public class Solution {
    public static void main(String[] args) {
        Ipod ipod=new Ipod();
        SmartPhone smartPhone=new SmartPhone();
        FirstNokiaPhone firstNokiaPhone=new FirstNokiaPhone();

        ipod.playMusic("rainbow.mp3");
        firstNokiaPhone.call();
        firstNokiaPhone.sendSMS();
        smartPhone.call();
        smartPhone.playMusic("Sky.mp3");
        smartPhone.playCallertune("Saami.mp3");
        smartPhone.playVideo("Jingle bale.mp4");
        smartPhone.sendSMS();
    }
}
