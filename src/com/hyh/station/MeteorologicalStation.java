package com.hyh.station;

public class MeteorologicalStation {
    private float pressure;
    private float temperature;
    private float humidity;
    private ACompany company;

    public MeteorologicalStation(ACompany company) {
        this.company=company;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    /**
     * 实时提供天气情况
     * */
    public void uploadData(float pressure,float temperature,float humidity){
        company.getMeteorologicalStationData(pressure, temperature, humidity);
    }
}
