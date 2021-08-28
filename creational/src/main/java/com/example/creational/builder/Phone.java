package com.example.creational.builder;

public class Phone {

    private String os;
    private int ram;
    private int storage;
    private String processor;
    private double screenSize;
    private int battery;

    public Phone(String os, int ram, int storage, String processor, double screenSize, int battery) {
        this.os = os;
        this.ram = ram;
        this.storage = storage;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                '}';
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}
