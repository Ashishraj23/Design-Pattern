package com.example.structural.decorator;

public class WindowsPhone extends SmartPhone {
    public WindowsPhone(Phone phone) {
        super(phone);
    }

    @Override
    public String build() {
        return super.build() + addOS();
    }

    private String addOS() {
        return "Windows OS v1.0";
    }
}
