package exercise3x;

public class Main {
    public static void main(String[] args) {

        FileReaderService fileReader = new FileReaderService();

        try {

            fileReader.readFile("src/main/java/exercise3x/testText.txt");
            System.out.println(fileReader.readFile("src/main/java/exercise3x/testText.txt"));

            fileReader.readFile("src/main/java/exercise3x/testDummyText.txt");
            System.out.println(fileReader.readFile("src/main/java/exercise3x/testDummyText.txt"));

            fileReader.readFile("");

            fileReader.readFile(null);

        } catch (InvalidFileFormatException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
