package DesignPatterns.组合模式;

public class Main {
    public static void main(String[] args) {

        Manager ceo = new Manager("总经理");

        Manager tech = new Manager("技术经理");
        Manager hr = new Manager("人事经理");

        Staff a = new Staff("张三");
        Staff b = new Staff("李四");
        Staff c = new Staff("王五");

        tech.add(a);
        tech.add(b);

        hr.add(c);

        ceo.add(tech);
        ceo.add(hr);

        ceo.show();
    }
}