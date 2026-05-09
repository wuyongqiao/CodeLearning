package 泛型;

public class Person<T> {
    private Integer age = 10;

    public void add(T age , T age2){
        System.out.println(age + "---" + age2);
    }
}
