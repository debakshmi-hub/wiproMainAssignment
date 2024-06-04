package day5.task7;

public class ThreadSafeExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        ImmutableData immutableData = new ImmutableData(42);

        // Demonstrate usage of the Counter class
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.decrement();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final count (Thread-Safe Counter): " + counter.getCount());

        // Demonstrate usage of the ImmutableData class
        System.out.println("Immutable Data Value: " + immutableData.getValue());
    }
}
