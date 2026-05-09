package DesignPatterns.外观模式;

public class Computer {
    private CPU cpu = new CPU();

    private Memory memory = new Memory();

    public void startComputer() {
        cpu.start();
        memory.load();
        System.out.println("电脑启动完成");
    }
}
