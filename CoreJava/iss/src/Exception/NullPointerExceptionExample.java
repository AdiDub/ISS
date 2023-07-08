package Exception;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String text = null;
        
        try {
            int length = text.length();
            System.out.println("Length: " + length);
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException occurred: " + ex.getMessage());
        }
    }
}
