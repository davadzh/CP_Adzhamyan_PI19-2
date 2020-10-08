package com.company;

public abstract class Car {

    protected String color;
    protected double maxSpeed;
    protected String transmissionType;
    protected double currentSpeed;
    protected double price;

    public Car(String color,
               double maxSpeed,
               String transmissionType,
               double currentSpeed,
               double price)
    {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transmissionType = transmissionType;
        this.currentSpeed = currentSpeed;
        this.price = price;
    }

    protected void start(){
        if (currentSpeed != 0)
            currentSpeed = 10;
        else
            System.out.println("Вы уже движетесь");
    }

    protected void stop()
    {
        if (currentSpeed == 0)
            currentSpeed = 0;
        else
            System.out.println("Вы уже стоите");
    }

    protected void accelerate(int speed)
    {
        if (currentSpeed == maxSpeed)
            System.out.println("Вы едете с максимальной скоростью. Ускориться невохможно");
        else if (currentSpeed + speed > maxSpeed)
            currentSpeed = maxSpeed;
        else
            currentSpeed += speed;
    }
}
