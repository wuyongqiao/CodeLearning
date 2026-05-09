package 动态代理.CGLIB;


public class AliSmsService {
    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }
}