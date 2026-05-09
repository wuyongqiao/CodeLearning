package 多线程;

public class person {
    private int age = 10;
    public person(){
    }
    public person(int age){
        this.age = age;
    }
    public void   add(){
        synchronized (this){
            this.age ++;
            System.out.println("age:" + age);
        }
    }
    public int get() {
        return age;
    }
}
