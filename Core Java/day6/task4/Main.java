package day6.task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of Person objects
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 20));
        people.add(new Person("Charlie", 30));

        // Sort the list by age using a lambda expression
        people.sort(Comparator.comparingInt(person -> person.getAge()));

        // Print the sorted list
        System.out.println("Sorted list of people by age:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
