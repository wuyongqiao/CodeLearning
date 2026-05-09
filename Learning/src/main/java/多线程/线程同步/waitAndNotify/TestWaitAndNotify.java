package 多线程.线程同步.waitAndNotify;

import java.util.ArrayList;

public class TestWaitAndNotify {
    public static void main(String[] args) {
        TaskQueue queue = new TaskQueue();
        var ts = new ArrayList<Thread>();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    queue.product(String.valueOf(i));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread.start();

        for (int i = 0; i < 5; i++) {
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    String consume = queue.consume();
                    System.out.println("consume" + consume);
                }
            });
            thread1.start();
        }
    }
}
