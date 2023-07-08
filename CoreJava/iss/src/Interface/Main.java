package Interface;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        
        cat.makeSound();
        cat.sleep();
        
        dog.makeSound();
        dog.sleep();
    }
}
