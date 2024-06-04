package day6.task1;

public class Main {
    public static void main(String[] args) {
        // Creating a Pair object
        Pair<String, Integer> myPair = new Pair<>("hello", 123);

        // Accessing elements
        System.out.println("First element: " + myPair.getFirst());
        System.out.println("Second element: " + myPair.getSecond());

        // Reversing the pair
        Pair<Integer, String> reversedPair = myPair.reverse();
        System.out.println("Reversed Pair: (" + reversedPair.getFirst() + ", " + reversedPair.getSecond() + ")");
    }
}
