package DesignPatterns.原型模式;

public class Clause implements Cloneable {
    private String content;

    public Clause(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    protected Clause clone() {
        try {
            return (Clause) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
