package Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // Declaration and initialization of an integer array
        int[] numbers = {5, 10, 15, 20, 25};
        
        // Accessing array elements
        System.out.println("Element at index 0: " + numbers[0]);
        System.out.println("Element at index 2: " + numbers[2]);
        
        // Modifying array elements
        numbers[3] = 30;
        System.out.println("Modified element at index 3: " + numbers[3]);
        
        // Array length
        int length = numbers.length;
        System.out.println("Array length: " + length);
        
        // Iterating over an array using a for loop
        for (int i = 0; i < length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        
        // Declaration and initialization of a string array
        String[] names = {"Alice", "Bob", "Charlie"};
        
        // Accessing and printing string array elements
        System.out.println("Element at index 0: " + names[0]);
        System.out.println("Element at index 2: " + names[2]);
        
        // Array length
        int namesLength = names.length;
        System.out.println("Array length: " + namesLength);
    }
}
