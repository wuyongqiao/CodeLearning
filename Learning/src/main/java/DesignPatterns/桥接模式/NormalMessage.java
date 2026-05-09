package DesignPatterns.桥接模式;

public class NormalMessage extends Message{
    public NormalMessage(MessageSender sender) {
        super(sender);
    }
    @Override
    public void sendMessage(String msg) {
        System.out.println("普通消息");
    }
}
