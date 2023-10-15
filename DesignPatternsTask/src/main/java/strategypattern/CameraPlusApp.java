package strategypattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CameraPlusApp extends PhoneCameraApp {
    private static Logger logger = LogManager.getLogger(CameraPlusApp.class);

    @Override
    public void editPhoto() {
        logger.debug("editing photos by using cameraPlus app");
    }


}
