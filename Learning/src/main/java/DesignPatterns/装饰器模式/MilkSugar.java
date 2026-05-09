package DesignPatterns.装饰器模式;

public class MilkSugar extends MilkDecorator{

    public MilkSugar(Coffee coffee) {
        super(coffee);
    }
    public String getName(){
        return coffee.getName() + "+糖";
    }
}
