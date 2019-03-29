package com.hyh.proxy;

public class SimpleProxy implements Interface {

    private Interface anInterface;

    public SimpleProxy(Interface anInterface) {
        this.anInterface = anInterface;
    }

    @Override
    public void doSomething() {
        System.out.print("SimpleProxy doSomething");
        anInterface.doSomething();
    }

    @Override
    public void somethingElse(String args) {
        System.out.print("SimpleProxy somethingElse" +args);
        anInterface.somethingElse(args);
    }
}
