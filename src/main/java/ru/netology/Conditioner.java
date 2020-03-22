package ru.netology;

public class Conditioner {
    private String name;
    private int maxTemperature = 28;
    private int minTemperature = 16;
    private int currentTemperature = 21;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }


    public void IncreaseCurrentTemperature() {
        if (currentTemperature < maxTemperature)
            currentTemperature += 1;
        {
            return;
        }
    }

    public void DecreaseCurrentTemperature() {
        if (currentTemperature > minTemperature)
            currentTemperature -= 1;
        {
            return;
        }
    }


}







