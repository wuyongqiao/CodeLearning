package DesignPatterns.工厂方法.简单工厂模式;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createShape("circle");
        shape.draw();
    }
}
