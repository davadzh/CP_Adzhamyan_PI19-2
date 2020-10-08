package com.company.Cars;

import com.company.Car;

public class HyundaiCreta extends Car {

    private double enginePower;
    private final double maxSpeedIncrease = 1.3;
    private final double enginePowerIncrease = 1.17;

    public HyundaiCreta(String color,
                       double maxSpeed,
                       String transmissionType,
                       double currentSpeed,
                       double price,
                       double enginePower)
    {
        super(color, maxSpeed, transmissionType, currentSpeed, price);
        this.enginePower = enginePower;
    }

    public void turboModeOn()
    {
        maxSpeed *= maxSpeedIncrease;
        enginePower *= enginePowerIncrease;
    }

    public void turboModeOff()
    {
        maxSpeed /= maxSpeedIncrease;
        enginePower /= enginePowerIncrease;
    }
}
