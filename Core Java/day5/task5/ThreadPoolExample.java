package day5.task5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // Create a fixed-size thread pool with 4 threads
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        // Submit multiple tasks to the thread pool
        for (int i = 0; i < 10; i++) {
            int taskId = i;
            executorService.submit(new Task(taskId));
        }

        // Shut down the executor service
        executorService.shutdown();

        try {
            // Wait for all tasks to complete before continuing
            if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }

        System.out.println("All tasks completed.");
    }
}
