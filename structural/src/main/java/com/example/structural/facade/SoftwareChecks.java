package com.example.structural.facade;

public class SoftwareChecks {

    OSChecksOnBoot osChecksOnBoot;
    DriverChecks driverChecks;
    public SoftwareChecks() {
        this.osChecksOnBoot = new OSChecksOnBoot();
        this.driverChecks = new DriverChecks();
    }
    boolean checkSoftwareOnBoot(){
        return osChecksOnBoot.checkOSOnBoot() && driverChecks.checkDriverOnBoot();
    }
}

