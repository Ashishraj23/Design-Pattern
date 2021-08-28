package com.example.structural.adapetr;

public class MobileAdapterImpl implements MobileAdapter {

    private WallSocket wallSocket;

    /**
     * using composition here
     * @param wallSocket
     */
    public MobileAdapterImpl(WallSocket wallSocket) {
        this.wallSocket = wallSocket;
    }

    @Override
    public Volts get3Volts() {
        Volts v240 = wallSocket.get240Volts();
        int v3 = v240.getVolts()/80;
        return new Volts(v3);
    }
}
