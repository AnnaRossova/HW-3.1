package ru.netology;

public class Radio {

    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStation = 5;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume = 5;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void IncreaseCurrentVolume() {
        if (currentVolume < maxVolume)
            currentVolume += 1;
        {
            return;
        }
    }

    public void DecreaseCurrentVolume() {
        if (currentVolume > minVolume)
            currentVolume -= 1;
        {
            return;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }


    public void NextRadiostation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation += 1;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void PrevRadiostation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation -= 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public int playTheStation(int radiostation) {
        if (radiostation <= 9 && radiostation >= 0) {
            currentRadioStation = radiostation;
        }
        return currentRadioStation;

    }
}