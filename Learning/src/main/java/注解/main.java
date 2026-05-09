package 注解;

import java.lang.reflect.Field;

public class main {
    public static void main(String[] args) {
        Class<UserService> aClass = UserService.class;
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            if(field.isAnnotationPresent(Test.class)){
                Test annotation = field.getAnnotation(Test.class);
                System.out.println("操作：" + annotation.value());
                System.out.println("等级：" + annotation.level());
            }
        }
    }
}
