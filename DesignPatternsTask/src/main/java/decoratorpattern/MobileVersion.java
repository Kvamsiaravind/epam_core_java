package decoratorpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MobileVersion extends Decorator {

    static int mobileVersionrank = 5;
    private static Logger logger = LogManager.getLogger(MobileVersion.class);

    public MobileVersion(WebPage webPage) {
        super(webPage);
    }

    @Override
    public void addWidgets(Widget widget) {
        super.addWidgets(widget);
        mobileVersionrank += widget.getRank();
        logger.info("mobile version rank");
    }

    @Override
    public void getRank(Widget widget) {
        logger.info(mobileVersionrank);
    }
}
