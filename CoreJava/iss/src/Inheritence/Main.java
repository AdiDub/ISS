package Inheritence;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Whiskers");
        cat.eat();
        cat.sleep();
        cat.meow();
        
        Dog dog = new Dog("Buddy");
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
