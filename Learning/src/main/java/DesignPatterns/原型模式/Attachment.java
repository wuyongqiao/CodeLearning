package DesignPatterns.原型模式;

public class Attachment implements Cloneable {
    private String fileName;

    public Attachment(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    protected Attachment clone() {
        try {
            return (Attachment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}