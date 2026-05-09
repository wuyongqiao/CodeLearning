package DesignPatterns.单例模式.线程安全懒汉式;

public class Singleton {
    private  static  Singleton instance;

    private Singleton() {}

    public static  synchronized  Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
