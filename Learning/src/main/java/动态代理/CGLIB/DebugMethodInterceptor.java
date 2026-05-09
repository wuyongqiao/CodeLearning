package 动态代理.CGLIB;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;



/**
 * 自定义MethodInterceptor
 */
public class DebugMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

        //调用方法之前，我们可以添加自己的操作
        System.out.println("before method " + method.getName());
        Object object = proxy.invokeSuper(obj, args);
        //调用方法之后，我们同样可以添加自己的操作
        System.out.println("after method " + method.getName());
        return object;
    }


    /**
     * @param o           代理对象本身（注意不是原始对象，如果使用method.invoke(o, args)会导致循环调用）
     * @param method      被拦截的方法（需要增强的方法）
     * @param args        方法入参
     * @param methodProxy 高性能的方法调用机制，避免反射开销
     */


}