package Variables;

public class LocalVariable {

	public static void main(String[] args) {
		LocalVariable example = new LocalVariable();
		example.PrintMessage();
	}
	public void PrintMessage() {
		String message = "Hello ISS"; //Local variable
		System.out.println(message);
	}

}
