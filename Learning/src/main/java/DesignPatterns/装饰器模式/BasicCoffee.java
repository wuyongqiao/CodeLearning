package DesignPatterns.装饰器模式;

public class BasicCoffee extends Coffee{
    @Override
    public String getName() {
        return "原味咖啡";
    }

    @Override
    public double cost() {
        return 10;
    }
}
