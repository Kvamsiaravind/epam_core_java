package stratergypattern;

import strategypattern.*;

public class TestCameraApp {
    public static void main(String[] args) {
        SharingPhotos photosSharingBySocialMedia = new PhotosSharingBySocialMedia();
        PhoneCameraApp cameraPlusApp = new CameraPlusApp();
        PhoneCameraApp basicCameraApp = new BasicCameraApp();
        cameraPlusApp.takeAPhoto();
        cameraPlusApp.savePhoto();
        ((CameraPlusApp) cameraPlusApp).editPhoto();
        cameraPlusApp.setSharingPhotos(photosSharingBySocialMedia);
        cameraPlusApp.share();

    }
}
