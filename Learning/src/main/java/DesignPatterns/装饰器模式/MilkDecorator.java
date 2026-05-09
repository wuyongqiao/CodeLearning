package DesignPatterns.装饰器模式;

class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getName() {
        return coffee.getName() + " + 牛奶";
    }

    @Override
    public double cost() {
        return coffee.cost() + 3;
    }
}