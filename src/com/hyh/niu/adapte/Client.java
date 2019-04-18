package com.hyh.niu.adapte;

public class Client {
    public static void main(String[] main) {
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();
        Target adapter = new Adapter();
        adapter.request();
    }
}
