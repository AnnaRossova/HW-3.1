package ru.netology;

public class Conditioner {

    private String name;
    private final static int max_Temperature = 28;
    private final static int min_Temperature = 16;
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


    public void increaseCurrentTemperature() {
        if (currentTemperature < max_Temperature)
            currentTemperature += 1;
    }


    public void decreaseCurrentTemperature() {
        if (currentTemperature > min_Temperature)
            currentTemperature -= 1;

    }


}








