package com.hyh.observers;

public class ChouXiangGuanChaZhe1ShiXian implements ChouXiangGuan1ChaZhe {
    private String name;

    public ChouXiangGuanChaZhe1ShiXian(String name) {
        this.name = name;
    }

    @Override
    public void update(String name) {
        System.out.println("抽象观察者1实现" + name);
    }
}
