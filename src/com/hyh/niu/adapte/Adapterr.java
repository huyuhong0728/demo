package com.hyh.niu.adapte;

public class Adapterr implements Target {

    private Adaptee adaptee;

    public Adapterr(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        this.adaptee.specificRequest();
    }
}
