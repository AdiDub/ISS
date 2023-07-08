package Overriding;

public class Main{
	public static void main(String args[]) {
		Cat kitty = new Cat();
		Dog buddy = new Dog();
		Animal animal = new Animal();
		
		kitty.makeSound();
		buddy.makeSound();
		animal.makeSound();
	}
}