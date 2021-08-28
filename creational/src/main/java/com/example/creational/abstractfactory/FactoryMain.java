package com.example.creational.abstractfactory;

public class FactoryMain {
    public static void main(String [] args){

        AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(false);
        Profession profession = abstractFactory.getProfession("Engineer");
        profession.printProfession();
    }
}
