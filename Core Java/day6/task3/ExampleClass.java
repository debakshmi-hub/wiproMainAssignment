package day6.task3;

public class ExampleClass {
    private String privateField;

    public ExampleClass() {
        this.privateField = "Initial value";
    }

    private void privateMethod() {
        System.out.println("Private method called");
    }

    // Public method to access private field
    public String getPrivateField() {
        return privateField;
    }
}
