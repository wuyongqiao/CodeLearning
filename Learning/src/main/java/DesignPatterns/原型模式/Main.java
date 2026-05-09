package DesignPatterns.原型模式;

public class Main {
    public static void main(String[] args) {

        // 1️⃣ 创建模板
        Contract template = new Contract("采购合同模板", 10000);
        template.addClause(new Clause("付款方式：月结"));
        template.addClause(new Clause("违约责任：赔偿10%"));

        template.addAttachment(new Attachment("合同模板.pdf"));

        // 2️⃣ 复制一份（原型模式核心）
        Contract contract1 = template.clone();
        contract1.setName("张三采购合同");

        // 3️⃣ 修改副本
        contract1.addClause(new Clause("补充条款：加急处理"));

        // 打印
        System.out.println("=== 模板 ===");
        template.print();

        System.out.println("\n=== 新合同 ===");
        contract1.print();
    }
}