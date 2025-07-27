package com.example.creational.singleton;

public class SingletonPattern implements Cloneable {
    private static SingletonPattern singletonPattern;
    private SingletonPattern(){

    }
//use anyone of them
    //unsafe if multiple thread 
    public static SingletonPattern getInstance(){
        if(singletonPattern == null)
            return new SingletonPattern();
        else return singletonPattern;
    }

    //for thread safe
    public static SingletonPattern getInstance(){
        if (singletonPattern == null) {
            synchronized (SingletonPattern.class) {
                if (singletonPattern == null) {
                    singletonPattern = new SingletonPattern();
                }
            }
        }
        return singletonPattern;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this;
    }
}
