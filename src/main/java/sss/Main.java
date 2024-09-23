package sss;
class NumberPrinter implements Runnable {
    private int number;
    private final Object lock;

    public NumberPrinter(Object lock) {
        this.lock = lock;
        this.number = 0;
    }

    @Override
    public void run() {
        while (number <= 200) {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " : " + number++);
                // 唤醒其他线程
                lock.notifyAll();
                try {
                    // 等待其他线程执行
                    if (number <= 200) {
                        lock.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Object lock = new Object();
        Thread thread1 = new Thread(new NumberPrinter(lock));
        Thread thread2 = new Thread(new NumberPrinter(lock));
        thread1.setName("Thread 1");
        thread2.setName("Thread 2");
        thread1.start();
        thread2.start();
    }
}