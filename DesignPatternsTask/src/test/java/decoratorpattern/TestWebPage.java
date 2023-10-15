package decoratorpattern;

public class TestWebPage {
    public static void main(String[] args) {
        WebPage desktopVersion = new DesktopVersion();
        WebPage mobileVersion = new MobileVersion(desktopVersion);
        Widget widgetOne = new Widget("groceries", 5);
        Widget widgetTwo = new Widget("fashions", 2);
        mobileVersion.addWidgets(widgetOne);
        mobileVersion.getRank(widgetOne);

        mobileVersion.addWidgets(widgetTwo);
        mobileVersion.getRank(widgetTwo);
    }

}
