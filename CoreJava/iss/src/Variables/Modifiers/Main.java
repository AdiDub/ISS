package Variables.Modifiers;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        
        // Accessing variables with different modifiers
//        person.privateName = "Private Name";         // Cannot be accessed outside the class
        person.protectedName = "Protected Name";     // Cannot be accessed outside the class or subclass
        person.publicName = "Public Name";           // Can be accessed from anywhere
        person.defaultName = "Default Name";         // Can be accessed within the same package
        
        // Accessing methods with different modifiers
//        person.privateMethod();                      // Cannot be called outside the class
        person.protectedMethod();                    // Cannot be called outside the class or subclass
        person.publicMethod();                       // Can be called from anywhere
        person.defaultMethod();                      // Can be called within the same package
    }
}
