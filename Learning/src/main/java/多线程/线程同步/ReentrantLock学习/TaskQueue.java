package 多线程.线程同步.ReentrantLock学习;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TaskQueue {
    private final Lock lock = new ReentrantLock();
    private final Queue<String> queue = new LinkedList<>();
    private final Condition condition = lock.newCondition();

    public void product(String id) {
        lock.lock();
        try {
            queue.add(id);
            condition.signalAll();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public String getTask() {
        lock.lock();
        try {
            while (queue.isEmpty()) {
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
            return queue.remove();
        } finally {
            lock.unlock();
        }
    }
}
