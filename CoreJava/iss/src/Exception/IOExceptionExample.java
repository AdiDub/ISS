package Exception;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("myfile.txt"));
            String line = reader.readLine();
            System.out.println("Line: " + line);
            reader.close();
        } catch (IOException ex) {
            System.out.println("IOException occurred: " + ex.getMessage());
        }
    }
}
