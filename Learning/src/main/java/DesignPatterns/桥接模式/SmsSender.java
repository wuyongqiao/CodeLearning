package DesignPatterns.桥接模式;

public class SmsSender implements   MessageSender{
    @Override
    public void send() {
        System.out.println("短信发送");
    }
}
