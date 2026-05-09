package DesignPatterns.单例模式.饿汉式;

public class Singleton {

    // 1. 类加载时就创建实例
    private static final Singleton INSTANCE = new Singleton();

    // 2. 构造方法私有化
    private Singleton() {}

    // 3. 提供访问方式
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
