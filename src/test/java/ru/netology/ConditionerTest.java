package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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
    public void increaseCurrentTemperatureComfort() {
        Conditioner conditioner = new Conditioner();
        int expected = 22;
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());

    }


    @Test
    public void increaseCurrentTemperatureHot() {
        Conditioner conditioner = new Conditioner();
        int expected = 28;
        conditioner.setCurrentTemperature(28);
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }


    @Test
    public void decreaseCurrentTemperatureComfort() {
        Conditioner conditioner = new Conditioner();
        int expected = 20;
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }


    @Test
    public void decreaseCurrentTemperatureCold() {
        Conditioner conditioner = new Conditioner();
        int expected = 16;
        conditioner.setCurrentTemperature(16);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

}
