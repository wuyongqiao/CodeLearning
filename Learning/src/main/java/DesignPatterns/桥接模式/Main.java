package DesignPatterns.桥接模式;

public class Main {
    public static void main(String[] args) {
        Message msg1 =  new NormalMessage(new SmsSender());
        msg1.sendMessage("----");
    }
}
