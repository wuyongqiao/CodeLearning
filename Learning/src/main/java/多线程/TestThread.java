package 多线程;



public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        final Integer[] i = {10};
        Thread thread = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        while (i[0] <1000){
                            System.out.println(i[0]);
                            i[0]++;
                        }
                    }
                }
        );
        thread.start();

        thread.interrupt();

        Thread thread1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("hello world-----111");
                    }
                }
        );
        thread1.start();
    }
}
