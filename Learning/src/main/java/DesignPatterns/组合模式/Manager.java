package DesignPatterns.组合模式;

import java.util.ArrayList;
import java.util.List;

class Manager extends Employee {

    private List<Employee> list = new ArrayList<>();

    public Manager(String name) {
        super(name);
    }

    public void add(Employee employee) {
        list.add(employee);
    }

    public void remove(Employee employee) {
        list.remove(employee);
    }

    @Override
    public void show() {
        System.out.println("经理：" + name);

        for (Employee e : list) {
            e.show();
        }
    }
}