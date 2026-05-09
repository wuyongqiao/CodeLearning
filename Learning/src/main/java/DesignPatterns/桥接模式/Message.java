package DesignPatterns.桥接模式;

public abstract class Message {
    private MessageSender messageSender;

    public Message(MessageSender sender) {
        this.messageSender = sender;
    }

    public abstract void sendMessage(String msg);
}
