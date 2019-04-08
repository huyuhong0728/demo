package com.hyh.Singleton;

public class Test {
    public static void main(String[] args) {
        Singleton message1 = Singleton.getInstance();
        message1.setName("第一");
        Singleton message2 = Singleton.getInstance();
        message2.setName("第二");
        message1.printInfo();
        message2.printInfo();
        if (message1 == message2) {
            System.out.println("创建的是同一个实例");
        }else {
            System.out.println("创建的不是同一个实例");
        }
    }
}
