package day5.task3;

public class ItemHolder {
    private int item;
    private boolean hasItem = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (hasItem) {
            wait();
        }
        item = value;
        hasItem = true;
        System.out.println("Produced: " + value);
        notify(); // Notify the consumer that an item is available
    }

    public synchronized int consume() throws InterruptedException {
        while (!hasItem) {
            wait();
        }
        int consumedItem = item;
        hasItem = false;
        System.out.println("Consumed: " + consumedItem);
        notify(); // Notify the producer that space is available
        return consumedItem;
    }
}
