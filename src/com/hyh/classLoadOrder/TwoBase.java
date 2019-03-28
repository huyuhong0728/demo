package com.hyh.classLoadOrder;

public class TwoBase extends OneBase{
    public static int a3 = getStaticTwoBase();
    public int b3 = getInstanceTwoBase();

    public TwoBase() {
        System.out.print("基类子二的构造方法" + this.b3 + "\n");
    }
    static {
        System.out.print("基类子二的静态方法" + a3 + "\n");
    }
    public static int getStaticTwoBase() {
        System.out.print("基类子二有名字的静态方法\n");
        return 30;
    }
    public int getInstanceTwoBase() {
        System.out.print("基类子二有名字的方法\n");
        return 300;
    }

    public static void main(String[] args) {
        new TwoBase();
    }
}
