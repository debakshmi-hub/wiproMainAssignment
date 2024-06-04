package day5.task3;

public class Producer implements Runnable {
    private ItemHolder itemHolder;

    public Producer(ItemHolder itemHolder) {
        this.itemHolder = itemHolder;
    }

    @Override
    public void run() {
        int value = 0;
        try {
            while (true) {
                itemHolder.produce(value++);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
