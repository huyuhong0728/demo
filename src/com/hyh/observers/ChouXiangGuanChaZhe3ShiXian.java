package com.hyh.observers;

public class ChouXiangGuanChaZhe3ShiXian implements ChouXiangGuan1ChaZhe {
    private String name;

    public ChouXiangGuanChaZhe3ShiXian(String name) {
        this.name = name;
    }

    @Override
    public void update(String name) {
        System.out.println("抽象观察者3实现" + name);
    }
}
