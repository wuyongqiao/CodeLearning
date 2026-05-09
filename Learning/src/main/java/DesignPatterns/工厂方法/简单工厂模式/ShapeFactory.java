package DesignPatterns.工厂方法.简单工厂模式;

public class ShapeFactory {
    public static Shape createShape(String type){
        if("circle".equals(type)){
            return new Circle();
        } else if ("rectangle".equals(type)) {
            return new Rectangle();
        }
        return null;
    }
}
