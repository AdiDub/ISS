package Exception;

public class ArrayIndexOutOfBoundExceptionExample {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3 };
        
        try {
            int value = numbers[3];
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + ex.getMessage());
        }
    }
}
