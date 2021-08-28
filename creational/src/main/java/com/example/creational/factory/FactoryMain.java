package com.example.creational.factory;

import com.example.creational.factory.phone.OS;
import com.example.creational.factory.phone.OperatingSystemFactory;

public class FactoryMain {

    public static void main(String [] a){

        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
        OS os = operatingSystemFactory.getInstance("android");
        os.getSpac();
    }
}
