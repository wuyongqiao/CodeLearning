package DesignPatterns.生成器模式;

public class Main {
    public static void main(String[] args) {
        new DingRequest.Builder().processCode("processCode").build();
    }
}
