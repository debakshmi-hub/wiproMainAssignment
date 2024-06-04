package day6.task5;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);

        operateOnPerson(person,
            p -> p.getAge() >= 18,                     // Predicate: Check if person is an adult
            p -> "Hello, " + p.getName() + "!",        // Function: Convert person's name to a greeting message
            (x) -> System.out.println(x),              // Consumer: Print the message
            () -> new Person("Unknown", 0)   // Supplier: Create a default Person object
        );
    }

    public static void operateOnPerson(Person person,
                                       Predicate<Person> predicate,
                                       Function<Person, String> function,
                                       Consumer<String> consumer,
                                       Supplier<Person> supplier) {
        if (predicate.test(person)) {
            String message = function.apply(person);
            consumer.accept(message);
        } else {
            Person defaultPerson = supplier.get();
            String message = function.apply(defaultPerson);
            consumer.accept(message);
        }
    }
}