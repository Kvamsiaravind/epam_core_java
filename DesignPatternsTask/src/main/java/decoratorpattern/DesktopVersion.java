package decoratorpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DesktopVersion implements WebPage {
    static int desktopVersionrank = 10;
    private static Logger logger = LogManager.getLogger(DesktopVersion.class);

    @Override
    public void addWidgets(Widget widget) {
        desktopVersionrank += widget.getRank();
        logger.info("desktop version rank" + widget + "is added" + desktopVersionrank);
    }

    @Override
    public void getRank(Widget widget) {
        logger.info(desktopVersionrank);
    }
}
