package com.hyh.observers;

public class Test {
    public static void main(String[] args) {
        ChouXiangBeiGuanChaZheShiXian chouXiangBeiGuanChaZheShiXian = new ChouXiangBeiGuanChaZheShiXian();

        ChouXiangGuanChaZhe1ShiXian chouXiangGuanChaZhe1ShiXian = new ChouXiangGuanChaZhe1ShiXian("观察者1");
        ChouXiangGuanChaZhe2ShiXian chouXiangGuanChaZhe2ShiXian = new ChouXiangGuanChaZhe2ShiXian("观察者2");
        ChouXiangGuanChaZhe3ShiXian chouXiangGuanChaZhe3ShiXian = new ChouXiangGuanChaZhe3ShiXian("观察者3");
        chouXiangBeiGuanChaZheShiXian.addChouXiangBeiGuanChaZhe(chouXiangGuanChaZhe1ShiXian);
        chouXiangBeiGuanChaZheShiXian.addChouXiangBeiGuanChaZhe(chouXiangGuanChaZhe2ShiXian);
        chouXiangBeiGuanChaZheShiXian.addChouXiangBeiGuanChaZhe(chouXiangGuanChaZhe3ShiXian);
        chouXiangBeiGuanChaZheShiXian.notifyChouXiangBeiGuanChaZhe("消息");
    }
}
