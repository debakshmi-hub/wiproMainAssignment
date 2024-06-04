package day5.task4;

public class BankAccountSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Thread depositThread1 = new Thread(new DepositTask(account, 200));
        Thread depositThread2 = new Thread(new DepositTask(account, 300));
        Thread withdrawThread1 = new Thread(new WithdrawTask(account, 150));
        Thread withdrawThread2 = new Thread(new WithdrawTask(account, 400));

        depositThread1.start();
        depositThread2.start();
        withdrawThread1.start();
        withdrawThread2.start();
    }
}
