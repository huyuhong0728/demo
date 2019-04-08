package com.hyh.niu.adapte;

public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.specificRequest();
    }
}
