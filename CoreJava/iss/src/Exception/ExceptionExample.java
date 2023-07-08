package Exception;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Exception occurred: " + ex.getMessage());
        }
    }
    
    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}
