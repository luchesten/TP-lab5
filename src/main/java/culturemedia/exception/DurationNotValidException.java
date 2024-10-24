package culturemedia.exception;

import java.text.MessageFormat;
public class DurationNotValidException extends CultureMediaException {
    public DurationNotValidException(String title,Double duration) {
        super(MessageFormat.format(
                "The duration of the video {0} is too short : {1}",title,duration));
    }
}
