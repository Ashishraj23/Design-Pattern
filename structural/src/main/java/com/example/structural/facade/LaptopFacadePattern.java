package com.example.structural.facade;

public class LaptopFacadePattern {

    /**
     * when we press the laptop button then there are more complex work happening
     * inside the laptop like motherboard check, ram checks os checks e.t.c.
     * but client no need to worries about what is happening inside,
     * @param args
     */
    public static void main(String [] args){
        LaptopOnSwitch laptopOnSwitch = new LaptopOnSwitch();
        laptopOnSwitch.switchOnLaptop();
    }
}
