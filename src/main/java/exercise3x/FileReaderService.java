package exercise3x;

import java.io.*;

public class FileReaderService {

    public String readFile(String fileName) throws InvalidFileFormatException {

        BufferedReader reader = null;
        String content = "";

        if (fileName == null) {
            System.out.println("input can't be null");
            throw new IllegalArgumentException("Input can not be null!!");
        }

        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                content += line + "\n";
            }

            if (content.isEmpty()) throw new InvalidFileFormatException("File is Empty!");
        } catch (NullPointerException e) {
            System.out.println("File can not be null");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Reading file failed!");
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.out.println("Closing file failed!");
            }
        }
        return content;
    }
}