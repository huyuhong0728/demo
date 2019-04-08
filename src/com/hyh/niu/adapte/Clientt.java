package com.hyh.niu.adapte;

public class Clientt {
    public static void main(String[] args) {
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();
        Target adapterr = new Adapterr(new Adaptee());
        adapterr.request();
    }
}
