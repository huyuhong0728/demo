package com.hyh.niu;

public class Client {
    public static void main(String[] args) {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        for (int i = 0; i< 10; i++) {
            ConcretePrototype clonecp = (ConcretePrototype)concretePrototype.clone();
            clonecp.show();
        }
    }
}
