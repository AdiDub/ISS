package Strings;

import java.util.Scanner;

public class StringInputOutputExample {
    public static void main(String[] args) {
        // Input of a string using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        
        // Output of the entered string
        System.out.println("You entered: " + name);
        
        // Closing the Scanner
        scanner.close();
    }
}
