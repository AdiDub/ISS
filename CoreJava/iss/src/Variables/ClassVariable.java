package Variables;

public class ClassVariable {
	static int count; //Class variable
	public void incrementCount() {
		count += 1;
	}
	public static void main(String[] args) {
		ClassVariable example1 = new ClassVariable();
        example1.incrementCount();
        
        ClassVariable example2 = new ClassVariable();
        example2.incrementCount();
        
        System.out.println("Count: " + count);

	}

}
