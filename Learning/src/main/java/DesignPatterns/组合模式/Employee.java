package DesignPatterns.组合模式;

abstract class Employee {

    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract void show();
}