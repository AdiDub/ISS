package Variables.Modifiers;

public class Person {
    private String privateName;       // Private modifier
    protected String protectedName;   // Protected modifier
    public String publicName;         // Public modifier
    String defaultName;               // Default (no modifier)
    
    private void privateMethod() {
        System.out.println("Private Method");
    }
    
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }
    
    public void publicMethod() {
        System.out.println("Public Method");
    }
    
    void defaultMethod() {
        System.out.println("Default Method");
    }
}

