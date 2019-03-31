package com.hyh.javaObservable;

import java.util.Observable;
import java.util.Observer;

public class BCompany implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        WeatherData data=(WeatherData) arg;
        System.out.println("B pressure: "+data.pressure+",temperature: "+data.temperature+",humidity: "+data.humidity);
    }
}
