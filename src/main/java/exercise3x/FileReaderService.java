package exercise3x;

import java.io.*;

/**
 * Reads text files and returns their contents.
 */
public class FileReaderService {

    /**
     * Reads the contents of a text file.
     *
     * @param fileName the name of the file to read
     * @return the contents of the file
     * @throws InvalidFileFormatException if the file is empty
     * @throws IllegalArgumentException if the file name is null
     */
    public String readFile(String fileName) throws InvalidFileFormatException {

        String content = "";

        if (fileName == null) {
            throw new IllegalArgumentException("Input can not be null!!");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                content += line + "\n";
            }

            if (content.isEmpty()) throw new InvalidFileFormatException("File is Empty!");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Reading file failed!");
        }
        return content;
    }
}