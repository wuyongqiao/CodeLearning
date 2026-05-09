package DesignPatterns.组合模式;

public class Staff extends Employee{
    public Staff(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println("我是普通员工");
    }
}
