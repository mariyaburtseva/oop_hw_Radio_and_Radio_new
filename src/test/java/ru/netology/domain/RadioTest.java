package ru.netology.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @ParameterizedTest
    @CsvSource(
            value = {
                    "-1; 0",
                    "5; 5",
                    "10; 0"
            }
            , delimiter = ';'
    )
    void setCurrentStationTest(int start, int expected) {
        radio.setCurrentRadioStation(start);
        assertEquals(expected, radio.getCurrentRadioStationNumber());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "0; 1",
                    "9; 0"
            }
            , delimiter = ';'
    )
    void setNextRadioStationNumber(int start, int expected) {
        radio.setCurrentRadioStation(start);
        radio.setNextRadioStationNumber();
        assertEquals(expected, radio.getCurrentRadioStationNumber());
    }


    @ParameterizedTest
    @CsvSource(
            value = {
                    "0; 9",
                    "8; 7",
            }
            , delimiter = ';'
    )
    void setPrevRadioStationNumber(int start, int expected) {
        radio.setCurrentRadioStation(start);
        radio.setPrevRadioStationNumber();
        assertEquals(expected, radio.getCurrentRadioStationNumber());
    }


    //ГРОМКОСТЬ:
    @ParameterizedTest
    @CsvSource(
            value = {
                    "-1; 5",
                    "6; 6",
                    "11; 5"
            }
            , delimiter = ';'
    )
    void currentSoundVolume(int start, int expected) {
        radio.setCurrentSoundVolume(start);
        assertEquals(expected, radio.getCurrentSoundVolume());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "0; 1",
                    "10; 10"
            }
            , delimiter = ';'
    )
    void plusSoundVolume(int start, int expected) {
        radio.setCurrentSoundVolume(start);
        radio.plusSoundVolume();
        assertEquals(expected, radio.getCurrentSoundVolume());
    }


    @ParameterizedTest
    @CsvSource(
            value = {
                    "0; 0",
                    "10; 9"
            }
            , delimiter = ';'
    )
    void minusSoundVolume(int start, int expected) {
        radio.setCurrentSoundVolume(start);
        radio.minusSoundVolume();
        assertEquals(expected, radio.getCurrentSoundVolume());
    }
}


