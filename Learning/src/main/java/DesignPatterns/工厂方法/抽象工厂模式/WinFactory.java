package DesignPatterns.工厂方法.抽象工厂模式;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }
}
