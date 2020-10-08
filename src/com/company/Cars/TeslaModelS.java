package com.company.Cars;

import com.company.Car;

public class TeslaModelS extends Car {

    private double batteyVolume;
    private double currentBatteryLevel;
    private double wasteOfEnergyForDisplay;

    public TeslaModelS(String color,
                       double maxSpeed,
                       String transmissionType,
                       double currentSpeed,
                       double price,
                       double batteryVolume,
                       double wasteOfEnergyForDisplay)
    {
        super(color, maxSpeed, transmissionType, currentSpeed, price);
        this.batteyVolume = batteryVolume;
        this.wasteOfEnergyForDisplay = wasteOfEnergyForDisplay;
    }

    public void chargeBattery()
    {
        currentBatteryLevel = batteyVolume;
    }

    public void useDisplayOneDay()
    {
        if (currentBatteryLevel >= wasteOfEnergyForDisplay) {
            currentBatteryLevel -= wasteOfEnergyForDisplay;
            System.out.println("Использование дисплея включено (в течение 1 дня)");
        }
        else
            System.out.println("У вас недостаточно заряда для использования дислпея");
    }
}
