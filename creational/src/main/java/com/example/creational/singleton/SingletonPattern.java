package com.example.creational.singleton;

public class SingletonPattern implements Cloneable {
    private static SingletonPattern singletonPattern;
    private SingletonPattern(){

    }
    public static SingletonPattern getInstance(){
        if(singletonPattern == null)
            return new SingletonPattern();
        else return singletonPattern;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this;
    }
}
