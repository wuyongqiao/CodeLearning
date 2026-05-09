package 多线程.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class psvm {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 6; i++) {
            threadPool.submit(new Task("" + i));
        }
        threadPool.close();

//        new ThreadPoolExecutor()
    }
    static class Task implements  Runnable{
        private final String name;

        public Task(String name) {
            this.name = name;
        }
        @Override
        public void run() {
            System.out.println("task name:" + name);
        }
    }
}
