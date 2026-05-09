package DesignPatterns.装饰器模式;

public abstract class CoffeeDecorator extends Coffee{

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
