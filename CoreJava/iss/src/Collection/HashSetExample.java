package Collection;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        // Adding students
        students.add(new Student(1, "Aditya"));
        students.add(new Student(2, "Gaurav"));
        students.add(new Student(3, "Tanmay"));
        students.add(new Student(2, "Aditya")); // Duplicate student

        // Iterating over students
        for (Student student : students) {
            System.out.println(student);
        }

        // Removing students
        students.remove(new Student(1, "Aditya"));

        // Checking if a student exists
        boolean containsAnish = students.contains(new Student(3, "Anish"));
        System.out.println("Contains Anish: " + containsAnish);
    }
}
