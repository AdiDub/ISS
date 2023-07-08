package Polymorphism;

public class Main{
	public static void main(String args[]) {
		Shape shape1 = new Rectangle(2,3);
		Shape shape2 = new Circle(3);
		
		System.out.println("Area of Rectangle: "+ shape1.calculateArea());
		System.out.println("Area of Circle: "+ shape2.calculateArea());
	}
}