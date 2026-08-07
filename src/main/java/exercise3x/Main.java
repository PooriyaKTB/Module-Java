package exercise3x;

public class Main {
    public static void main(String[] args){

        FileReaderService fileReader = new FileReaderService();

        System.out.println("*** Test File ***");
        runFileReader(fileReader, "src/main/java/exercise3x/testText.txt");
        System.out.println("*** Empty File ***");
        runFileReader(fileReader, "src/main/java/exercise3x/testDummyText.txt");
        System.out.println("*** Empty/Wrong FileName ***");
        runFileReader(fileReader, "");
        runFileReader(fileReader, "someWhere");
        System.out.println("*** null as argument ***");
        runFileReader(fileReader, null);

        try {
            System.out.println("*** Print Test File ***");
            System.out.println(fileReader.readFile("src/main/java/exercise3x/testText.txt"));
            System.out.println("*** Print Empty File ***");
            System.out.println(fileReader.readFile("src/main/java/exercise3x/testDummyText.txt"));
        } catch (InvalidFileFormatException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("*** Print Empty FileName ***");
            System.out.println(fileReader.readFile(""));
        } catch (InvalidFileFormatException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("*** Print null as argument ***");
            System.out.println(fileReader.readFile(null));
        } catch (InvalidFileFormatException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void runFileReader(FileReaderService fileReader, String fileName) {
        try {
            fileReader.readFile(fileName);
        } catch (InvalidFileFormatException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
