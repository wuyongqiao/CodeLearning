package DesignPatterns.工厂方法.工厂方法模式;

public class Main {
    public static void main(String[] args) {
        Shape shape = new RectangleFactory().createShape();
        shape.draw();

        Shape shape2 = new CircleFactory().createShape();
        shape2.draw();
    }
}
