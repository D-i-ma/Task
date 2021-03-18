public class InvalidCardNumderException extends Throwable {
    public InvalidCardNumderException() {
    }

    public InvalidCardNumderException(String message) {
        super(message);
    }

    public InvalidCardNumderException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCardNumderException(Throwable cause) {
        super(cause);
    }

    public InvalidCardNumderException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
