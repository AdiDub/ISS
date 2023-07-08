package Strings;

public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // length() method - returns the length of the string
        int length = str.length();
        System.out.println("Length: " + length);
        
        // charAt() method - returns the character at the specified index
        char character = str.charAt(7);
        System.out.println("Character at index 7: " + character);
        
        // substring() method - extracts a substring from the original string
        String substring = str.substring(7);
        System.out.println("Substring from index 7: " + substring);
        
        // indexOf() method - returns the index of the first occurrence of a specified substring
        int index = str.indexOf("World");
        System.out.println("Index of 'World': " + index);
        
        // equals() method - compares two strings for equality
        boolean isEqual = str.equals("Hello, World!");
        System.out.println("Is equal to 'Hello, World!': " + isEqual);
        
        // startsWith() method - checks if the string starts with the specified prefix
        boolean startsWith = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWith);
        
        // endsWith() method - checks if the string ends with the specified suffix
        boolean endsWith = str.endsWith("!");
        System.out.println("Ends with '!': " + endsWith);
        
        // toUpperCase() method - converts the string to uppercase
        String uppercase = str.toUpperCase();
        System.out.println("Uppercase: " + uppercase);
        
        // toLowerCase() method - converts the string to lowercase
        String lowercase = str.toLowerCase();
        System.out.println("Lowercase: " + lowercase);
        
        // replace() method - replaces occurrences of a specified character or substring
        String replaced = str.replace("World", "Java");
        System.out.println("Replaced: " + replaced);
    }
}
