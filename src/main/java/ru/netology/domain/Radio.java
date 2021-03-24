package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int maxRadioStationNumber = 10;
    private int minRadioStationNumber = 0;
    private int currentRadioStationNumber = 5;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;
    private int currentSoundVolume = 50;


    /*//AllArgsConstructor

    public Radio(int currentRadioStationNumber, int maxRadioStationNumber, int currentSoundVolume) {
        this.currentRadioStationNumber = currentRadioStationNumber;
        this.maxRadioStationNumber = maxRadioStationNumber;
        this.currentSoundVolume = currentSoundVolume;
    }

    //NoArgsConstructor
    public Radio() {
    }

    public void setCurrentRadioStation(int radioStationNumber) {
        if (radioStationNumber > this.maxRadioStationNumber) {
            return;
        }
        if (radioStationNumber < this.minRadioStationNumber) {
            return;
        }
        this.currentRadioStationNumber = radioStationNumber;
    }

    public void setNextRadioStationNumber(int i) {
        if (currentRadioStationNumber == this.maxRadioStationNumber) {
            currentRadioStationNumber = this.minRadioStationNumber;
            return;
        }
        this.currentRadioStationNumber++;
    }

    public void setPrevRadioStationNumber(int i) {
        if (getCurrentRadioStationNumber() == this.minRadioStationNumber) {
            currentRadioStationNumber = this.maxRadioStationNumber;
            return;
        }
        this.currentRadioStationNumber--;
    }

    //Get radioStation
    public int getCurrentRadioStationNumber() {
        return this.currentRadioStationNumber;
    }


    //   ГРОМКОСТЬ :
    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume > this.maxSoundVolume) {
            return;
        }
        if (currentSoundVolume < this.minSoundVolume) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public void plusSoundVolume() {  // увеличение звука
        if (currentSoundVolume == this.maxSoundVolume) {
            return;
        }
        this.currentSoundVolume++;
    }

    public void minusSoundVolume() {   // уменьшение звука
        if (currentSoundVolume == this.minSoundVolume) {
            return;
        }
        this.currentSoundVolume--;
    }

    //Get volume
    public int getCurrentSoundVolume() {
        return this.currentSoundVolume;
    }*/
}