package 注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME) // 运行时可获取
public @interface Test {
    String value() default "0000";   // 注解参数
    int level() default 1;

}
