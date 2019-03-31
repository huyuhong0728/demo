package com.hyh.javaObservable;

import java.util.Observable;
import java.util.Observer;

public class ACompany implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        WeatherData data=(WeatherData) arg;
        System.out.println("A pressure: "+data.pressure+",temperature: "+data.temperature+",humidity: "+data.humidity);
        }
    }
