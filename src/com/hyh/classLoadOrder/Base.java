package com.hyh.classLoadOrder;

public class Base {
    public static int a1 = 10;
    public int b1 = 100;
    static {
        System.out.print("基类的静态方法" + a1 + "\n");
    }
    public Base() {
        System.out.print("基类的构造方法" + this.b1 + "\n");
    }
}
