package Constructor;


public class Person{
	private String name;
	private int age;
	
	//Constructor is used to initialize the object with the values passes while creating
	public Person(String InitialName, int InitialAge) {
		name = InitialName;
		age = InitialAge;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public static void main(String args[]) {
		Person person1 = new Person("Aditya Dubey", 21);
		
		System.out.println("Name of the person: "+ person1.getName());
		System.out.println("Age of the person: "+ person1.getAge());
		
	}
}