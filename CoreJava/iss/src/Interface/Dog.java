package Interface;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
    
    @Override
    public void sleep() {
        System.out.println("The dog is sleeping.");
    }
}
