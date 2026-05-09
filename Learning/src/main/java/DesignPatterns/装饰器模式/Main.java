package DesignPatterns.装饰器模式;

public class Main {
    public static void main(String[] args) {

        Coffee coffee = new BasicCoffee();

        coffee = new MilkDecorator(coffee);

        System.out.println(coffee.getName());
        System.out.println(coffee.cost());
    }
}