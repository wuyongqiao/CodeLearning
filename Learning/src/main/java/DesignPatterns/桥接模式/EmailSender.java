package DesignPatterns.桥接模式;

public class EmailSender implements MessageSender{
    @Override
    public void send() {
        System.out.println("邮件发送");
    }
}
