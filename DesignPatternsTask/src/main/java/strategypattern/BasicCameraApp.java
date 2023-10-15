package strategypattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BasicCameraApp extends PhoneCameraApp {
    private static Logger logger = LogManager.getLogger(BasicCameraApp.class);

    @Override
    public void editPhoto() {
        logger.debug("editing photos by using basic camera app");
    }
}
