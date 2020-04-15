package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Radio {

    private static int max_Radio_Station = 10;
    private static int min_Radio_Station = 0;
    private int currentRadioStation = 5;
    private static int max_Volume = 100;
    private static int min_Volume = 0;
    private int currentVolume = 5;


    public int getCurrentVolume() {
        return currentVolume;
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
        if (radiostation <= 10) {
            currentRadioStation = radiostation;
        }
        return currentRadioStation;
    }


    public Radio(int currentVolume, int max_Volume, int min_Volume) {
        this.currentVolume = currentVolume;
        this.max_Volume = max_Volume;
        this.min_Volume = min_Volume;
    }

}



