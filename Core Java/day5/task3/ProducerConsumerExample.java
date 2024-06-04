package day5.task3;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        ItemHolder itemHolder = new ItemHolder();

        Thread producerThread = new Thread(new Producer(itemHolder));
        Thread consumerThread = new Thread(new Consumer(itemHolder));

        producerThread.start();
        consumerThread.start();
    }
}
