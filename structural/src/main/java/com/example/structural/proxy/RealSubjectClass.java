package com.example.structural.proxy;

public class RealSubjectClass implements Subject {
    @Override
    public void method() {
        System.out.println("Hi client! How may I help You!");
    }
}
