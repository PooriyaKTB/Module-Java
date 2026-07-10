package src.prep.FileLogger;

/**
 * Provides logging functionality for the application,
 * abstracting file operations.
 */
public class ApplicationLogger {

//    public void logInfo(String tag, String line) {
//        FileLogger fileLogger = new FileLogger();
//        fileLogger.openFile();
//        fileLogger.writeLine("[INFO] " + line);
//        fileLogger.closeFile();
//    }
//
//    public void logError(String line) {
//        FileLogger fileLogger = new FileLogger();
//        fileLogger.openFile();
//        fileLogger.writeLine("[ERROR] " + line);
//        fileLogger.closeFile();
//    }

//    OR: (Following DRY principles)

    private void logging(String tag, String line) {
        FileLogger fileLogger = new FileLogger();
        fileLogger.openFile();
        fileLogger.writeLine(tag + line);
        fileLogger.closeFile();
    }

    /**
     * Logs an informational message.
     * @param line the message to log
     */
    public void logInfo(String line) {
        logging("[INFO] ", line);
    }

    /**
     * Logs an error message.
     * @param line the error message to log
     */
    public void logError(String line) {
        logging("[ERROR] ", line);
    }
}
