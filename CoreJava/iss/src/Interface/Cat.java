package Interface;

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
    
    @Override
    public void sleep() {
        System.out.println("The cat is sleeping.");
    }
}
