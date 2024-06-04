package day6.task3;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // Create an instance of ExampleClass
        ExampleClass obj = new ExampleClass();

        // Use reflection to get the private field "privateField"
        Field privateField = ExampleClass.class.getDeclaredField("privateField");

        // Make the private field accessible
        privateField.setAccessible(true);

        // Set the value of the private field to "Modified value"
        privateField.set(obj, "Modified value");

        // Access the modified private field through a public method
        System.out.println("Modified private field value: " + obj.getPrivateField());
    }
}
