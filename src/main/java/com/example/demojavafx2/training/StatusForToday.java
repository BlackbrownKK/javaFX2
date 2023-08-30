package com.example.demojavafx2.training;

import java.util.ArrayList;

public class StatusForToday implements Event {

    private ArrayList<Investition> myInvestition = new ArrayList<>();
    private int sum = 150;
    private int day = 0;

    @Override
    public void nextDay() {
        day++;
        deltaSum();
    }

    @Override
    public void deltaSum() {
        int totalProfitForToday = 0;
        for (Investition item : myInvestition) {
            totalProfitForToday += item.profitForDay;
        }
        sum += totalProfitForToday;
    }

    public int getSum(String item) {
        int result = 0;
        for (Investition in : myInvestition) {
            if (in.name.equals(item)) result++;
        }
        return result;
    }

    public void addItem(Investition item) {
        if (sum >= item.price) {
            myInvestition.add(item);
            sum = sum - item.price;
        } else {
            item = null;
            System.out.println("not enough money");
        }
    }

    public void addBicycle() {
        Bicycle myBike = new Bicycle();
        addItem(myBike);
    }

    public void addCar() {
        Car car = new Car();
        addItem(car);
    }

    public void addCoffeeAutomate() {
        CoffeeAutomate coffeeAutomate = new CoffeeAutomate();
        addItem(coffeeAutomate);
    }

    public void addElectricBicycle() {
        ElectricBicycle electricBicycle = new ElectricBicycle();
        addItem(electricBicycle);
    }

    public void addElectricScooter() {
        ElectricScooter electricScooter = new ElectricScooter();
        addItem(electricScooter);
    }

    public void addMobileHome() {
        MobileHome mobileHome = new MobileHome();
        addItem(mobileHome);
    }

    public void addScooter() {
        Scooter scooter = new Scooter();
        addItem(scooter);
    }

    public int getballance() {
        int profitForDay = 0;
        for (Investition item : myInvestition) {
            profitForDay += item.profitForDay;
        }
        return profitForDay;
    }

    public int getSum() {
        return sum;
    }

    public int getDay() {
        return day;
    }
}
