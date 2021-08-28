package com.example.structural.proxy;

public class Client {
    public static void main(String[] args){

        Subject proxy = new ProxyPattern();
        proxy.method();
    }
}
