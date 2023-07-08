package FileReadWrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class FileReadingExample {
    public static void main(String[] args) {
    	String fileName = Paths.get("").toAbsolutePath().toString() + "/src/FileReadWrite/data.txt";
    	
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
