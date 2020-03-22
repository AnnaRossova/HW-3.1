package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }


    @Test
    public void IncreaseCurrentTemperatureComfort() {
        Conditioner conditioner = new Conditioner();
        int expected = 22;
        conditioner.IncreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());

    }

    @Test
    public void IncreaseCurrentTemperatureHot() {
        Conditioner conditioner = new Conditioner();
        int expected = 28;
        conditioner.setCurrentTemperature(28);
        conditioner.IncreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void DecreaseCurrentTemperatureComfort() {
        Conditioner conditioner = new Conditioner();
        int expected = 20;
        conditioner.DecreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void DecreaseCurrentTemperatureCold() {
        Conditioner conditioner = new Conditioner();
        int expected = 16;
        conditioner.setCurrentTemperature(16);
        conditioner.DecreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }
}