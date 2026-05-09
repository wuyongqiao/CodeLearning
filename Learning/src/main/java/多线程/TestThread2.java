package 多线程;

public class TestThread2 {
    private static volatile   boolean running = true;


    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    if(running){
                        System.out.println(i);
                    }
                }
            }
        });
        thread.start();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("----------");
                running = false;
            }
        });
        thread1.start();
    }
}
