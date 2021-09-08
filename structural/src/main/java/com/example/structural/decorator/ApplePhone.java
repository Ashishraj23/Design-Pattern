package com.example.structural.decorator;

public class ApplePhone extends SmartPhone {
    public ApplePhone(Phone phone) {
        super(phone);
    }

    @Override
    public String build() {
        return super.build() + addOS();
    }

    private String addOS() {
        return "IOS OS v14.0";
    }
}
