package DesignPatterns.原型模式;

import java.util.ArrayList;
import java.util.List;

public class Contract implements Cloneable {

    private String name;
    private double amount;
    private List<Clause> clauses;
    private List<Attachment> attachments;

    public Contract(String name, double amount) {
        this.name = name;
        this.amount = amount;
        this.clauses = new ArrayList<>();
        this.attachments = new ArrayList<>();
    }

    public void addClause(Clause clause) {
        clauses.add(clause);
    }

    public void addAttachment(Attachment attachment) {
        attachments.add(attachment);
    }

    public void setName(String name) {
        this.name = name;
    }

    // 👉 关键：深拷贝
    @Override
    protected Contract clone() {
        try {
            Contract copy = (Contract) super.clone();

            // 深拷贝 clauses
            copy.clauses = new ArrayList<>();
            for (Clause clause : this.clauses) {
                copy.clauses.add(clause.clone());
            }

            // 深拷贝 attachments
            copy.attachments = new ArrayList<>();
            for (Attachment att : this.attachments) {
                copy.attachments.add(att.clone());
            }

            return copy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void print() {
        System.out.println("合同名称：" + name);
        System.out.println("金额：" + amount);

        System.out.println("条款：");
        for (Clause c : clauses) {
            System.out.println(" - " + c.getContent());
        }

        System.out.println("附件：");
        for (Attachment a : attachments) {
            System.out.println(" - " + a.getFileName());
        }
    }
}