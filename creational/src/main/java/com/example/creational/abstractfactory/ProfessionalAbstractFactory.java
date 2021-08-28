package com.example.creational.abstractfactory;

public class ProfessionalAbstractFactory extends AbstractFactory{
    @Override
    Profession getProfession(String typeOfProfession) {
        if(typeOfProfession.equalsIgnoreCase("Engineer")){
            return new Engineer();
        }
        if(typeOfProfession.equalsIgnoreCase("Teacher")){
            return new Teacher();
        }
        return null;
    }
}
