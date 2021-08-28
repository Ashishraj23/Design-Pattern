package com.example.creational.builder;

public class Shop {

    public static void main(String [] args){

        Phone ph = new PhoneBuilder().setOs("android").setBattery(5000).getPhone();
        System.out.println(ph);
    }
}
