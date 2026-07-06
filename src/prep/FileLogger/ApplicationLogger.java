package src.prep.FileLogger;

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

    public void logInfo(String line) {
        logging("[INFO] ", line);
    }

    public void logError(String line) {
        logging("[ERROR] ", line);
    }
}
