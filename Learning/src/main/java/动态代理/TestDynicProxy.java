package 动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestDynicProxy {
    public static void main(String[] args) {
        UserServiceImpl service = new UserServiceImpl();

        UserService object = (UserService) Proxy.newProxyInstance(
                TestDynicProxy.class.getClassLoader(),
                service.getClass().getInterfaces(),
                new MyInvocationHandler(service)
        );
        object.login();
    }

}
