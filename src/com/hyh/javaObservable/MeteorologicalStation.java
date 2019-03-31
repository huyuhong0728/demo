package com.hyh.javaObservable;

import java.util.Observable;

public class MeteorologicalStation extends Observable {
    private float pressure;
    private float temperature;
    private float humidity;

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void uploadData(float pressure, float temperature, float humidity) {
        this.pressure = pressure;
        this.temperature = temperature;
        this.humidity = humidity;
        WeatherData data = new WeatherData(pressure, temperature, humidity);
        /**
         * setChanged
         * 根据有些特定的需求出现的，设置后唤醒才有效，
         * 例如我们不需要温度改变0.5我们也去唤醒客户，
         * 因此这里我们可以判断后在设置
         * */
        this.setChanged();
        this.notifyObservers(data);
    }
}