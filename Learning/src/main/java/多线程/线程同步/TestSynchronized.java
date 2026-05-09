package 多线程.线程同步;

import 多线程.person;

public class TestSynchronized {
    public static void main(String[] args) {
        person person = new person(19);


        for (int i = 0; i < 100; i++) {
                    Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                person.add();
            }
        });
        thread.start();
        }
    }
}
