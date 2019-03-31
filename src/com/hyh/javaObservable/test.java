package com.hyh.javaObservable;

public class test {
    public static void main(String[] args) {
        ACompany aCompany = new ACompany();
        BCompany bCompany = new BCompany();
        MeteorologicalStation meteorologicalStation = new MeteorologicalStation();
        meteorologicalStation.addObserver(aCompany);
        meteorologicalStation.addObserver(bCompany);
        meteorologicalStation.uploadData(10,20,30);
        meteorologicalStation.deleteObserver(aCompany);
        meteorologicalStation.uploadData(40,50,60);
    }
}
