package com.hyh.classLoadOrder;

public class OneBase extends Base {
    public static int a2 = getStaticOneBase();
    public int b2 = getInstanceOneBase();

    public OneBase() {
        System.out.print("基类子一的构造方法" + this.b2 + "\n");
    }
    static {
        System.out.print("基类子一的静态方法" + a2 + "\n");
    }
    public static int getStaticOneBase() {
        System.out.print("基类子一有名字的静态方法\n");
        return 20;
    }
    public int getInstanceOneBase() {
        System.out.print("基类子一有名字的方法\n");
        return 200;
    }
}
