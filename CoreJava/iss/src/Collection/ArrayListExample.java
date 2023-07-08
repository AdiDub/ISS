package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Adding students
        students.add(new Student(1, "Aditya"));
        students.add(new Student(2, "Gaurav"));
        students.add(new Student(3, "Tanmay"));

        // Accessing students
        Student firstStudent = students.get(0);
        System.out.println("First Student: " + firstStudent);

        // Modifying students
        students.set(1, new Student(2, "Anish"));

        // Removing students
        students.remove(2);

        // Iterating over students
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student [ID: " + id + ", Name: " + name + "]";
    }
}

