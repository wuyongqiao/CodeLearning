package 多线程;

public class StudentThread extends Thread {
    @Override
    public void run() {
        System.out.println("start new thread!");
    }

    public static void main(String[] args) {
//        StudentThread thread = new StudentThread();
//        thread.start();
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
