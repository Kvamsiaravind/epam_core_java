package strategypattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PhotoSharingByEmail implements SharingPhotos {
    private static Logger logger = LogManager.getLogger(PhotoSharingByEmail.class);

    @Override
    public void sharePhoto() {
        logger.debug("sharing photos through email..");
    }
}
