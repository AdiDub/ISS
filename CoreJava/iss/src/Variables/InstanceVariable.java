package Variables;

public class InstanceVariable {
	String name;
	public void printName() {
        System.out.println("Name: " + name);
    }
    
    public static void main(String[] args) {
        InstanceVariable example = new InstanceVariable();
        example.name = "John Doe";
        example.printName();
    }

}
