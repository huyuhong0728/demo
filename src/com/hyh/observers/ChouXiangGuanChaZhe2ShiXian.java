package com.hyh.observers;

public class ChouXiangGuanChaZhe2ShiXian implements ChouXiangGuan1ChaZhe {
    private String name;

    public ChouXiangGuanChaZhe2ShiXian(String name) {
        this.name = name;
    }

    @Override
    public void update(String name) {
        System.out.println("抽象观察者2实现" + name);
    }
}
