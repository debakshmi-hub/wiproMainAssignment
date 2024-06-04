package day5.task6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PrimeNumbersExample {
    public static void main(String[] args) {
        int maxNumber = 100;
        int numberOfThreads = 4;

        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);

        List<Integer> primeNumbers = new ArrayList<>();

        // Submit the task to calculate prime numbers to the thread pool
        CompletableFuture<Void> primeCalculationFuture = CompletableFuture.runAsync(() -> {
            for (int i = 2; i <= maxNumber; i++) {
                if (isPrime(i)) {
                    primeNumbers.add(i);
                }
            }
        }, executorService);

        // When prime calculation is done, write results to a file
        primeCalculationFuture.thenRunAsync(() -> {
            writeToFile(primeNumbers, "primes.txt");
        }, executorService);

        // Shut down the executor service
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Method to write the prime numbers to a file
    public static void writeToFile(List<Integer> numbers, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (int number : numbers) {
                writer.write(number + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
