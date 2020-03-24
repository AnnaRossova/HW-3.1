package ru.netology;

public class Radio {

    private final static int max_Radio_Station = 9;
    private final static int min_Radio_Station = 0;
    private int currentRadioStation = 5;
    private final static int max_Volume = 10;
    private final static int min_Volume = 0;
    private int currentVolume = 5;


    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }


    public void increaseCurrentVolume() {
        if (currentVolume < max_Volume)
            currentVolume += 1;
    }


    public void decreaseCurrentVolume() {
        if (currentVolume > min_Volume)
            currentVolume -= 1;
     }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }


    public void nextRadiostation() {
        if (currentRadioStation < max_Radio_Station) {
            currentRadioStation += 1;
        } else {
            currentRadioStation = min_Radio_Station;
        }

    }


    public void prevRadiostation() {
        if (currentRadioStation > min_Radio_Station) {
            currentRadioStation -= 1;
        } else {
            currentRadioStation = max_Radio_Station;
        }

    }


    public int playTheStation(int radiostation) {
        if (radiostation <= 9 && radiostation >= 0) {
            currentRadioStation = radiostation;
        }
        return currentRadioStation;
    }

}

