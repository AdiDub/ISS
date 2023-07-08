//package Comparable;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class ComparatorExample {
//    public static void main(String[] args) {
//        List<Student> students = new ArrayList<>();
//        students.add(new Student(3, "Alice"));
//        students.add(new Student(1, "Bob"));
//        students.add(new Student(2, "Charlie"));
//
//        // Sorts the list using a custom comparator
//        Collections.sort(students, new StudentNameComparator());
//
//        for (Student student : students) {
//            System.out.println(student);
//        }
//    }
//}
//
//class Student {
//    private int id;
//    private String name;
//
//    public Student(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public String toString() {
//        return "Student [ID: " + id + ", Name: " + name + "]";
//    }
//}
//
//class StudentNameComparator implements Comparator<Student> {
//    @Override
//    public int compare(Student student1, Student student2) {
//        return student1.getName().compareTo(student2.getName());
//    }
//}
