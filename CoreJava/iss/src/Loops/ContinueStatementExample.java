package Loops;

public class ContinueStatementExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skips the current iteration when i is equal to 3
            }
            System.out.println("Iteration: " + i);
        }
    }
}
