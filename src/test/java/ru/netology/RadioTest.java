package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void increaseCurrentVolumeMax() {
        Radio radio = new Radio(100, 100, 0);
        radio.increaseCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }


    @Test
    void increaseCurrentVolume() {
        Radio radio = new Radio(5, 100, 0);
        radio.increaseCurrentVolume();
        assertEquals(6, radio.getCurrentVolume());
    }


    @Test
    void decreaseCurrentVolume() {
        Radio radio = new Radio(5, 100, 0);
        int expected = 4;
        radio.decreaseCurrentVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }


    @Test
    void decreaseCurrentVolumeMin() {
        Radio radio = new Radio(0, 100, 0);
        int expected = 0;
        radio.decreaseCurrentVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }


    @Test
    void DecreaseCurrentVolumeMin() {
        Radio radio = new Radio(0, 100, 0);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }


    @Test
    void nextRadiostation() {
        Radio radio = new Radio(5, 10);
        int expected = 6;
        radio.nextRadiostation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }


    @Test
    void nextRadiostationLast() {
        Radio radio = new Radio(10, 10);
        int expected = 0;
        radio.nextRadiostation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }


    @Test
    void prevRadiostation() {
        Radio radio = new Radio(5, 10);
        int expected = 4;
        radio.prevRadiostation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }


    @Test
    void radiostationFirst() {
        Radio radio = new Radio(0, 10);
        int expected = 10;
        radio.prevRadiostation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }


    @Test
    void playTheStation() {
        Radio radio = new Radio(8, 10);
        int expected = 8;
        radio.playTheStation(8);
        assertEquals(expected, radio.playTheStation(8));
    }


    @Test
    void playTheStationWrongNumber() {
        Radio radio = new Radio(5, 10);
        int expected = 5;
        assertEquals(expected, radio.playTheStation(11));
    }


}




