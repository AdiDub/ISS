package Final;

public class FinalVariable {
    public static void main(String[] args) {
        final int age = 25; // Final variable
        
        // Trying to modify the final variable will result in a compilation error
        // age = 30;
        
        System.out.println("Age: " + age);
    }
}
