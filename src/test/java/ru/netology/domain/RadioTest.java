
package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldCreate() {
        Radio radio = new Radio();
    }
}
/*
    @Test
    public void setCurrentStationTest() {
        Radio radio = new Radio(1, 10, 25);
        radio.setCurrentRadioStation(1);
        int actual = radio.getCurrentRadioStationNumber();
        assertEquals(1, actual);
    }

    @Test
    public void setCurrentStationTestLessPermissible() {
        Radio radio = new Radio(10, 10, 25);
        radio.setCurrentRadioStation(-1);
        int actual = radio.getCurrentRadioStationNumber();
        assertEquals(10, actual);
    }

    @Test
    public void setCurrentStationTestMoreThatAllowed() {
        Radio radio = new Radio(10, 10, 25);
        radio.setCurrentRadioStation(11);
        int actual = radio.getCurrentRadioStationNumber();
        assertEquals(10, actual);
    }

    @Test //номер станции не должен быть больше максимального
    public void nextRadioStationNumber() {
        Radio radio = new Radio(0, 10, 25);
        radio.setNextRadioStationNumber(1);
        int actual = radio.getCurrentRadioStationNumber();
        assertEquals(1, actual);
    }

    @Test //Переключение на плюс одну в границах диапазона
    public void theNextStationIsWithinAcceptableLimits() {
        Radio radio = new Radio(10, 10, 25);
        radio.setNextRadioStationNumber(11);
        int actual = radio.getCurrentRadioStationNumber();
        assertEquals(0, actual);
    }

    @Test // станция не должна быть меньше минимальной
    public void setPrevRadioStationNumber() {
        Radio radio = new Radio(0, 10, 25);
        radio.setPrevRadioStationNumber(10);
        int actual = radio.getCurrentRadioStationNumber();
        assertEquals(10, actual);
    }

    @Test // Переключение на минус одну в границах диапазона
    public void previousStationWithinAcceptableRange() {
        Radio radio = new Radio(8, 10, 25);
        radio.setPrevRadioStationNumber(7);
        int actual = radio.getCurrentRadioStationNumber();
        assertEquals(7, actual);
    }

    //ГРОМКОСТЬ:
    @Test
    public void currentSoundVolume() {
        Radio radio = new Radio(5, 10, 51);
        radio.setCurrentSoundVolume(51);
        int actual = radio.getCurrentSoundVolume();
        assertEquals(51, actual);
    }

    @Test
    public void plusSoundVolume() {
        Radio radio = new Radio(5, 10, 100);
        radio.plusSoundVolume();
        radio.setCurrentSoundVolume(101);
        int actual = radio.getCurrentSoundVolume();
        assertEquals(100, actual);
    }

    @Test
    public void inTheRangePlusSoundVolume() {
        Radio radio = new Radio(5, 10, 67);
        radio.plusSoundVolume();
        radio.setCurrentSoundVolume(68);
        int actual = radio.getCurrentSoundVolume();
        assertEquals(68, actual);
    }

    @Test
    public void minusSoundVolume() {
        Radio radio = new Radio(5, 10, 0);
        radio.minusSoundVolume();
        radio.setCurrentSoundVolume(-1);
        int actual = radio.getCurrentSoundVolume();
        assertEquals(0, actual);
    }

    @Test
    public void inTheRangeMinusSoundVolume() {
        Radio radio = new Radio(5, 10, 22);
        radio.minusSoundVolume();
        radio.setCurrentSoundVolume(21);
        int actual = radio.getCurrentSoundVolume();
        assertEquals(21, actual);
    }
}*/
