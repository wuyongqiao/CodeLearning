package DesignPatterns.工厂方法.抽象工厂模式;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory = new WinFactory();
        Button button = factory.createButton();
        button.click();
    }
}
