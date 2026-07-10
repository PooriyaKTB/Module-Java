package src.prep.FileLogger;

/**
 * Manages the lifecycle of a log file, including opening, writing, and closing.
 */
class FileLogger {

    private boolean fileOpen = false;

    /**
     * Opens the log file for writing.
     * @throws IllegalStateException if the file is already open.
     */
    public void openFile() {
        if (fileOpen) {
            throw new IllegalStateException("File already open");
        }
        System.out.println("Opening log file...");
        fileOpen = true;
    }

    /**
     * Writes a line to the log file.
     * @param line the content to write
     * @throws IllegalStateException if the file is not open.
     */
    public void writeLine(String line) {
        if (!fileOpen) {
            throw new IllegalStateException("Cannot write - file not open");
        }
        System.out.println("LOG: " + line);
    }

    /**
     * Closes the log file.
     * @throws IllegalStateException if the file is already closed.
     */
    public void closeFile() {
        if (!fileOpen) {
            throw new IllegalStateException("File already closed");
        }
        System.out.println("Closing log file...");
        fileOpen = false;
    }
}
