package 静态代理;

public class TestProxy implements Person{

    private Person person;

    private TestProxy(Person person){
        this.person = person;
    }

    @Override
    public void doWork() {
        System.out.println("我是 testProxy");
        person.doWork();
        System.out.println("我是 testProxy");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.doWork();
        TestProxy proxy = new TestProxy(student);
        proxy.doWork();
    }
}
