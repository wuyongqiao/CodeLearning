package DesignPatterns.桥接模式;

public class UrgentMessage  extends Message{
    public UrgentMessage(MessageSender sender) {
        super(sender);
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println("紧急消息");
    }
}
