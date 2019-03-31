package com.hyh.station;

public class StationTest {
    public static void main(String[] args) {
        ACompany aCompany = new ACompany();
        MeteorologicalStation meteorologicalStation = new MeteorologicalStation(aCompany);
        meteorologicalStation.uploadData(10,20,30);
    }
}
