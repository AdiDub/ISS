package Overriding;

public class Dog extends Animal{
	@Override
	public void makeSound() {
		System.out.println("The dog barks");
	}
}