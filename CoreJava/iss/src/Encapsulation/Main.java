package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Aditya Dubey");
        person.setAge(21);
        
        //The Person class encapsulates the attributes name and age that can only be accessed using get and set methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
