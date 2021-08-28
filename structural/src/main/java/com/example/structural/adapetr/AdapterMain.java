package com.example.structural.adapetr;

public class AdapterMain {

    public static void main(String[] args){

        WallSocket wallSocket = new WallSocketImpl();
        Volts v240 = wallSocket.get240Volts();
        System.out.println(v240);

        MobileAdapter mobileAdapter = new MobileAdapterImpl(wallSocket);
        Volts v3 = mobileAdapter.get3Volts();
        System.out.println(v3);
    }
}
