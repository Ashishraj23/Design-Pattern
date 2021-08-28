package com.example.structural.adapetr;

public class Volts {

    private int volts;

    public Volts(int volts) {
        this.volts = volts;
    }

    public int getVolts() {
        return volts;
    }

    @Override
    public String toString() {
        return "Volts{" +
                "volts=" + volts +
                '}';
    }
}
