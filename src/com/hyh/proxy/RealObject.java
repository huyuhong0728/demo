package com.hyh.proxy;

public class RealObject implements Interface{

    @Override
    public void doSomething() {
        System.out.print("doSomething");
    }

    @Override
    public void somethingElse(String args) {
        System.out.print("somethingElse" + args);
    }
}
