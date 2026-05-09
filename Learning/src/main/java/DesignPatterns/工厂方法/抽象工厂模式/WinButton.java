package DesignPatterns.工厂方法.抽象工厂模式;

public class WinButton implements Button {
    @Override
    public void click() {
        System.out.println("WinButton clicked");
    }
}
