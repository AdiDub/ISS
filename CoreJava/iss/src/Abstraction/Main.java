package Abstraction;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        
        animal1.makeSound();
        animal1.sleep();
        
        animal2.makeSound();
        animal2.sleep();
    }
}
