package DesignPatterns.适配器模式;

public class Main {
    public static void main(String[] args) {
        /*
        * 适配器模式（Adapter Pattern） 是 Java 设计模式中非常常见的一种 结构型模式。它的核心作用是：让两个原本接口不兼容的类，可以一起工作
        *
        * */
        PrinterAdapter adapter = new PrinterAdapter(new OldPrinter());
        adapter.print();
    }
}
