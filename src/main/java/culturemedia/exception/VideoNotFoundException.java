package culturemedia.exception;

public class VideoNotFoundException extends CultureMediaException {
    public VideoNotFoundException() {
        super(null);
    }
    public VideoNotFoundException(String title) {
        super(title);
    }
}
