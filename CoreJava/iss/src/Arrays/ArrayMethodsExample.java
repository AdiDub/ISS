package Arrays;

import java.util.Arrays;

public class ArrayMethodsExample {
    public static void main(String[] args) {
        // Declaration and initialization of an integer array
        int[] numbers = {5, 10, 15, 20, 25};

        // Appending an element to the array
        int[] newArray = appendElement(numbers, 30);
        System.out.println("Array after appending: " + Arrays.toString(newArray));

        // Removing an element from the array
        int[] removedArray = removeElement(newArray, 15);
        System.out.println("Array after removal: " + Arrays.toString(removedArray));

        // Reversing the array
        int[] reversedArray = reverseArray(removedArray);
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
    }

    // Method to append an element to an array
    public static int[] appendElement(int[] array, int element) {
        int length = array.length;
        int[] newArray = Arrays.copyOf(array, length + 1);
        newArray[length] = element;
        return newArray;
    }

    // Method to remove an element from an array
    public static int[] removeElement(int[] array, int element) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return array; // Element not found, return the original array
        }

        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        return newArray;
    }

    // Method to reverse an array
    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[array.length - 1 - i] = array[i];
        }
        return reversedArray;
    }
}
