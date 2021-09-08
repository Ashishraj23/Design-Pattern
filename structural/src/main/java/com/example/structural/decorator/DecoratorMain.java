package com.example.structural.decorator;

public class DecoratorMain {

    public static void main(String [] args){

        Phone androidPhone = new AndroidPhone(new BasicPhone());
        System.out.println(androidPhone.build());

        Phone applePhone = new ApplePhone(new BasicPhone());
        System.out.println(applePhone.build());

        Phone nokiaWithWindowsPhone = new
                NokiaPhone(new WindowsPhone(new BasicPhone()));
        System.out.println(nokiaWithWindowsPhone.build());

        Phone nokiaWithAndroidPhone = new
                NokiaPhone(new AndroidPhone(new BasicPhone()));

        System.out.println(nokiaWithAndroidPhone.build());
    }
}
