package com.example.creational.factory.phone;

public class OperatingSystemFactory {


    public OS getInstance(String os) {
        switch (os.toLowerCase()) {
            case "windows":
                return new Windows();
            case "android":
                return new Android();
            default:
                return new IOS();

        }
    }
}
