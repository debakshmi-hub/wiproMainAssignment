package day5.task5;

public class Task implements Runnable{
    private int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " is starting.");
        // Simulate complex calculation or I/O operation
        performComplexCalculation();
        System.out.println("Task " + taskId + " is completed.");
    }

    private void performComplexCalculation() {
        // Simulate a complex calculation by sleeping for a random time
        try {
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
