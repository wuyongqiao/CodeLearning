package DesignPatterns.工厂方法.工厂方法模式;

public  class RectangleFactory {
    public static Shape createShape() {
        return new Rectangle();
    }
}
