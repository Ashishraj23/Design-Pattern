package com.example.structural.decorator;

public class BasicPhone implements Phone {
    @Override
    public String build() {
        return "Screen Battery, processor ";
    }
}
