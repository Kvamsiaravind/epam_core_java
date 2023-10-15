package practicepatterns.proxypattern;

import java.util.Arrays;
import java.util.List;

public class ProxyInternet implements Internet {
    private Internet internet = new RealInternet();
    private List<String> bannedSites = Arrays.asList("jetbrains.org", "sqt.com", "database.org", "udemy.com");

    @Override
    public void connectTo(String serverhost) throws Exception {
        if (bannedSites.contains(serverhost.toLowerCase())) {
            throw new Exception("Access denied");
        }
        internet.connectTo(serverhost);
    }
}
