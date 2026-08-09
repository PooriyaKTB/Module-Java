package exercise3x;

/**
 * Exception thrown when a file has an invalid format.
 */
public class InvalidFileFormatException extends Exception {

    public InvalidFileFormatException(String message) {
        super(message);
    }
}
