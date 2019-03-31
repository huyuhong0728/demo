package com.hyh.observer;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject {

    private List<Observer> weixinUserlist = new ArrayList<>();


    @Override
    public void attach(com.hyh.observer.Observer observer) {
        weixinUserlist.add(observer);
    }

    @Override
    public void detach(com.hyh.observer.Observer observer) {
        weixinUserlist.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer :weixinUserlist) {
            observer.update(message);
        }
    }
}
