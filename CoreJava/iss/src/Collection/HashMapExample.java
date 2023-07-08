package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Student, Student> studentMap = new HashMap<>();

        // Adding key-value pairs
        Student student1 = new Student(1, "Aditya");
        Student student2 = new Student(2, "Gaurav");
        Student student3 = new Student(3, "Tanmay");

        studentMap.put(student1, student1);
        studentMap.put(student2, student2);
        studentMap.put(student3, student3);

        // Accessing values
        Student retrievedStudent = studentMap.get(student2);
        System.out.println("Retrieved Student: " + retrievedStudent);

        // Modifying values
        studentMap.put(student3, new Student(3, "Anish"));

        // Removing key-value pairs
        studentMap.remove(student1);

        // Iterating over key-value pairs
        for (Map.Entry<Student, Student> entry : studentMap.entrySet()) {
            Student key = entry.getKey();
            Student value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
