package practicepatterns.proxypattern;

import java.util.Arrays;
import java.util.List;

public class User {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("jetbrains.org");
            internet.connectTo("spm.com");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
