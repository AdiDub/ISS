package Collection;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        
        // Adding elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        
        // Accessing elements
        System.out.println("First color: " + colors.getFirst());
        
        // Modifying elements
        colors.set(1, "Yellow");
        
        // Removing elements
        colors.removeLast();
        
        // Iterating over elements
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
