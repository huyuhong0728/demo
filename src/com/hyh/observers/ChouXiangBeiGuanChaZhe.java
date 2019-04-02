package com.hyh.observers;

public interface ChouXiangBeiGuanChaZhe {
    void addChouXiangBeiGuanChaZhe(ChouXiangGuan1ChaZhe chouXiangGuanChaZhe);

    void removeChouXiangBeiGuanChaZhe(ChouXiangGuan1ChaZhe chouXiangGuanChaZhe);

    void notifyChouXiangBeiGuanChaZhe(String message);
}
