package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void increaseCurrentVolumme() {
        Radio radio = new Radio();
        int expected = 6;
        radio.increaseCurrentVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }


    @Test
    public void increaseCurrentVolumeMax() {
        Radio radio = new Radio();
        int expected = 10;
        radio.setCurrentVolume(10);
        radio.increaseCurrentVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }


    @Test
    void decreaseCurrentVolume() {
        Radio radio = new Radio();
        int expected = 4;
        radio.decreaseCurrentVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }


    @Test
    public void decreaseCurrentVolumeMin() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }


    @Test
    void nextRadiostation() {
        Radio radio = new Radio();
        int expected = 6;
        radio.nextRadiostation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }


    @Test
    public void nextRadiostationLast() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentRadioStation(9);
        radio.nextRadiostation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }


    @Test
    void prevRadiostation() {
        Radio radio = new Radio();
        int expected = 4;
        radio.prevRadiostation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }


    @Test
    public void radiostationFirst() {
        Radio radio = new Radio();
        int expected = 9;
        radio.setCurrentRadioStation(0);
        radio.prevRadiostation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }


    @Test
    void playTheStation() {
        Radio radio = new Radio();
        int expected = 8;
        radio.playTheStation(8);
        assertEquals(expected, radio.playTheStation(8));
    }


    @Test
    void playTheStationWrongNumber() {
        Radio radio = new Radio();
        int expected = 5;
        radio.playTheStation(11);
        assertEquals(expected, radio.playTheStation(11));
    }

}




