package com.example.creational.abstractfactory;

public class TraineeProfessionalAbstractFactory extends AbstractFactory{
    @Override
    Profession getProfession(String typeOfProfession) {

        if(typeOfProfession.equalsIgnoreCase("Engineer")){
            return new TraineeEngineer();
        }
        if(typeOfProfession.equalsIgnoreCase("Teacher")){
            return new TraineeTeacher();
        }
        return null;
    }
}
