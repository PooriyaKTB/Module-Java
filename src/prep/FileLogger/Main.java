package src.prep.FileLogger;

public class Main {
    public static void main(String[] args) {
//         FileLogger fileLogger = new FileLogger();
//         fileLogger.openFile();
//         fileLogger.writeLine("Hi Pooriya!");
//         fileLogger.closeFile();

        ApplicationLogger applicationLogger = new ApplicationLogger();
        System.out.println("***INFO***");
        applicationLogger.logInfo("Logging the Info...");
        System.out.println("***ERROR***");
        applicationLogger.logError("Logging the Error...");
    }
}

// What complexity does ApplicationLogger hide from other classes?
// It hides the need to calling methods in order, there is no need to manually Open, Write and Close to do logging.

// How did the main method change when switching from FileLogger to ApplicationLogger?
// It's much more readable, cleaner and safer in use.

// Why is the new version simpler to use correctly?
// Because we no longer need to be worry about the order of invoking methods, we simply just invoke a method and get the result.

// What mistakes can other developers no longer make when using ApplicationLogger?
// Now developers cannot mistakenly forget to open file before or close it after a log

// Why is this important in large systems?
// In a large system it definitely prevents bugs or errors caused by forgetting to open or close the file (preventing Resource Leaking).

// If the system later logged to a database instead of a file, which class would you change?
// I believe it's better to implement new Class and call it "DatabaseLogger" instead of modifying "FileLogger", and letting "ApplicationLogger" handle abstraction. but also we can do change the "FileLogger", because the "FileLogger" is responsible for handling message, and "ApplicationLogger" is just an abstraction layer (but not a good practice of "Single responsibility" I think).

// Why is it useful that main() does not know how logging works internally?
// It doesn't essentially need to know, as the "How it works" is not really important in Main (knowing "What it does" is sufficient).

// How does this demonstrate abstraction reducing system complexity?
// By hiding unnecessary methods and the required order of invocation we make it much simpler to use the entire app.

// ** I'm not really sure, but I think for the last two question we can say we do "Decoupling"!