package com.example.structural.flyweight;

public class AnimalClient {
    public static void main(String [] args){

        Animal catAnimal = AnimalFactory.getCat("PUSSY");
        catAnimal.printAnimalAttributes();

        Animal dogAnimal = AnimalFactory.getDog("TOMMY");
        dogAnimal.printAnimalAttributes();

        Animal cowAnimal = AnimalFactory.getCow("COW");
        cowAnimal.printAnimalAttributes();

        Animal catAnimal2 = AnimalFactory.getCat("PUSSY");
        catAnimal2.printAnimalAttributes();

        System.out.println(catAnimal.hashCode());
        System.out.println(catAnimal2.hashCode());
        System.out.println(dogAnimal.hashCode());
        System.out.println(cowAnimal.hashCode());
    }
}
