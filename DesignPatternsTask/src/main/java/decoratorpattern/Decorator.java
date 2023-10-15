package decoratorpattern;

public class Decorator implements WebPage {
    private WebPage webPage;

    public Decorator(WebPage webPage) {
        this.webPage = webPage;
    }

    @Override
    public void addWidgets(Widget widget) {
        webPage.addWidgets(widget);
    }

    @Override
    public void getRank(Widget widget) {
        webPage.getRank(widget);
    }
}