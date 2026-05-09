package 多线程.线程同步.Semaphore学习;

import java.util.UUID;
import java.util.concurrent.Semaphore;

public class AccessLimitControl {
   private Semaphore semaphore =  new Semaphore(3);

   public String access() throws InterruptedException {
       semaphore.acquire();
       try {
           return UUID.randomUUID().toString();
       }finally {
           semaphore.release();
       }
   }
}
