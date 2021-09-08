package com.example.structural.facade;

public class LaptopOnSwitch {

    SoftwareChecks softwareChecks;
    HardwareChecks hardwareChecks;

    public LaptopOnSwitch() {
        this.hardwareChecks = new HardwareChecks();
        this.softwareChecks = new SoftwareChecks();
    }
    void switchOnLaptop(){
        if(hardwareChecks.checkAllHardware() && softwareChecks.checkSoftwareOnBoot()){
            System.out.println("Switching on laptop");
        }
        else{
            System.out.println("Unable to on laptop");
        }
    }
}
