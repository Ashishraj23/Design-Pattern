package com.example.structural.adapetr;

public class WallSocketImpl implements WallSocket {
    @Override
    public Volts get240Volts() {
        return new Volts(240);
    }
}
