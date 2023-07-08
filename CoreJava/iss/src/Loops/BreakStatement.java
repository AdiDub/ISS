package Loops;

public class BreakStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; // Breaks the loop when i is equal to 6
            }
            System.out.println("Iteration: " + i);
        }
    }
}
