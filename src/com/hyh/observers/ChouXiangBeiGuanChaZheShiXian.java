package com.hyh.observers;

import java.util.ArrayList;
import java.util.List;

public class ChouXiangBeiGuanChaZheShiXian implements ChouXiangBeiGuanChaZhe{

    private List<ChouXiangGuan1ChaZhe> list = new ArrayList<>();

    @Override
    public void addChouXiangBeiGuanChaZhe(ChouXiangGuan1ChaZhe chouXiangGuanChaZhe) {
            list.add(chouXiangGuanChaZhe);
    }

    @Override
    public void removeChouXiangBeiGuanChaZhe(ChouXiangGuan1ChaZhe chouXiangGuanChaZhe) {
            list.remove(chouXiangGuanChaZhe);
    }

    @Override
    public void notifyChouXiangBeiGuanChaZhe(String message) {
        for (ChouXiangGuan1ChaZhe chouXiangGuan1ChaZhe: list) {
            chouXiangGuan1ChaZhe.update(message);
        }
    }
}
