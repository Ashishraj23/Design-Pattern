package com.example.structural.proxy;

public class ProxyPattern extends RealSubjectClass {
    @Override
    public void method() {
        System.out.println("Hi I am Proxy i will perform authentication and security checks");
        /**
         * Logic to check if user are authentic or not, if yes then call real object method
         * otherwise don't call below super().method;
         * we can log also who are using this method for monitoring purpose
         */

        System.out.println("Calling real method of Real Subject implementing class after the call is authenticated");
        super.method();
    }
}
