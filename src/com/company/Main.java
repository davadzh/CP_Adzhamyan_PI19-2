package com.company;

import com.company.Cars.HyundaiCreta;
import com.company.Cars.TeslaModelS;

public class Main {

    public static void main(String[] args) {
        TeslaModelS tesla1 = new TeslaModelS("white",
                320.0,
                "Auto",
                0,
                3400000,
                9000,
                2500);

        TeslaModelS tesla2 = new TeslaModelS("red",
                330.0,
                "Mechanics",
                0,
                3500000,
                9000,
                2500);

        tesla1.useDisplayOneDay();
        tesla1.chargeBattery();
        tesla1.useDisplayOneDay();

        HyundaiCreta hyundaiCreta1 = new HyundaiCreta("yellow",
                260.0,
                "Auto",
                10,
                1200000,
                4350);

        hyundaiCreta1.turboModeOn();
        hyundaiCreta1.start();
        hyundaiCreta1.accelerate(20);
        hyundaiCreta1.turboModeOff();


        Garage garage = new Garage(10);
        garage.getCars("");

        garage.addCar(tesla2);
        garage.addCar(tesla1);
        garage.addCar(tesla1);
        garage.addCar(hyundaiCreta1);

        garage.getCars("");
    }
}
