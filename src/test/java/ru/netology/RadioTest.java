package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void IncreaseCurrentVolumme() {
        Radio radio = new Radio();
        int expected = 6;
        radio.IncreaseCurrentVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void IncreaseCurrentVolumeMax() {
        Radio radio = new Radio();
        int expected = 10;
        radio.setCurrentVolume(10);
        radio.IncreaseCurrentVolume();
        assertEquals(expected, radio.getCurrentVolume());

    }

    @Test
    void DecreaseCurrentVolume() {
        Radio radio = new Radio();
        int expected = 4;
        radio.DecreaseCurrentVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void DecreaseCurrentVolumeMin() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentVolume(0);
        radio.DecreaseCurrentVolume();
        assertEquals(expected, radio.getCurrentVolume());

    }

    @Test
    void NextRadiostation() {
        Radio radio = new Radio();
        int expected = 6;
        radio.NextRadiostation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void NextRadiostationLast() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentRadioStation(9);
        radio.NextRadiostation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void PrevRadiostation() {
        Radio radio = new Radio();
        int expected = 4;
        radio.PrevRadiostation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void RadiostationFirst() {
        Radio radio = new Radio();
        int expected = 9;
        radio.setCurrentRadioStation(0);
        radio.PrevRadiostation();
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


