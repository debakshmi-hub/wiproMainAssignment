package day5.task3;

public class Consumer implements Runnable {
    private ItemHolder itemHolder;

    public Consumer(ItemHolder itemHolder) {
        this.itemHolder = itemHolder;
    }

    @Override
    public void run() {
        try {
            while (true) {
                itemHolder.consume();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
