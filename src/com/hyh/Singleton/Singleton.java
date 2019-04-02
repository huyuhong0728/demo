package com.hyh.Singleton;

/**
 * 懒汉
 */
public class Singleton {
    String name = null;
    private Singleton() {

    }
    private static volatile Singleton singleton = null;

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("单例模式" + name);
    }
}
