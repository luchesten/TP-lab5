package culturemedia.exception;

public class DurationNotValidException extends CultureMediaException {
    public DurationNotValidException(String title,Double duration) {
        super(title + " : " + duration);
    }
}
