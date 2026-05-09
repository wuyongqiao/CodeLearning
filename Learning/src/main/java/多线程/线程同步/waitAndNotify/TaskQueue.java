package 多线程.线程同步.waitAndNotify;

import java.util.LinkedList;
import java.util.Queue;

public class TaskQueue {
    Queue<String> queue = new LinkedList<>();

    public synchronized void product(String name){
        this.queue.add(name);
        this.notifyAll();
    }

    public synchronized String  consume(){
        while (queue.isEmpty()) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return queue.remove();
    }


}
