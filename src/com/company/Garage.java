package com.company;

import java.util.*;

public class Garage {

    private int maxCapacity;
    private int currentCountOfCars = 0;
    private Map<String, List<Car>> cars = new HashMap<>();

    public Garage(int maxCapacity)
    {
        this.maxCapacity = maxCapacity;
    }

    public void addCar(Car car)
    {
        if (currentCountOfCars < maxCapacity)
        {
            String model = car.getClass().getSimpleName();

            if (cars.containsKey(model)) {
                List<Car> _cars = cars.get(model);
                _cars.add(car);
                cars.put(model, _cars);
                System.out.println("Добавлен новый автомобиль модели " + model);
            }
            else
            {
                List<Car> newModel = new ArrayList<>();
                newModel.add(car);
                cars.put(model, newModel);
                System.out.println("Добавлен первый автомобиль модели " + model);
            }
        }
        else
        {
            System.out.println("В гараже нет мест для нового автомобиля.");
        }
    }

//    private static void compareTo(int v1, int v2)
//    {
//
//    }

    public void getCars(String sortType)
    {
        if (cars != null)
        {
            System.out.println("В гараже есть следующие модели...");
            switch (sortType)
            {
                case "byCount":
                    //Сортировка по количеству
                    break;
                case "byPrice":
                    //Сортировка по цене
                    break;
                default:
                    for (Map.Entry<String, List<Car>> entry: cars.entrySet())
                        System.out.println(entry.getKey() + ": " + entry.getValue().size());
            }
        }
        else
            System.out.println("Гараж пуст.");
    }

}
