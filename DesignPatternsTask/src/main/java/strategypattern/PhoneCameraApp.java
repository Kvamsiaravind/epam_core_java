package strategypattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class PhoneCameraApp {
    private static Logger logger = LogManager.getLogger(PhoneCameraApp.class);
    private SharingPhotos sharingPhotos;

    public void takeAPhoto() {
        logger.debug("taken photo by using phone camera app..");
    }

    abstract void editPhoto();

    public void savePhoto() {
        logger.debug("saving photo in phone camera app..");
    }

    public void setSharingPhotos(SharingPhotos sharingPhotos) {
        this.sharingPhotos = sharingPhotos;
    }

    public void share() {
        sharingPhotos.sharePhoto();
    }
}
