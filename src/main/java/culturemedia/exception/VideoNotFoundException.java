package culturemedia.exception;

import java.text.MessageFormat;

public class VideoNotFoundException extends CultureMediaException {
    public VideoNotFoundException() {
        super("Videos not exist");
    }

    public VideoNotFoundException(String title) {
        super(
                MessageFormat.format("Video with title {0} not found", title)
        );
    }
}