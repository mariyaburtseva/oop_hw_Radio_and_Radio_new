package ru.netology.domain;

public class Radio {
    private final int maxRadioStationNumber = 9;
    private final int minRadioStationNumber = 0;
    private int currentRadioStationNumber = 0;
    private final int maxSoundVolume = 10;
    private final int minSoundVolume = 0;
    private int currentSoundVolume = 5;

    public void setCurrentRadioStation(int radioStationNumber) {
        if (radioStationNumber > this.maxRadioStationNumber) {
            return;
        }
        if (radioStationNumber < this.minRadioStationNumber) {
            return;
        }
        this.currentRadioStationNumber = radioStationNumber;
    }

    public void setNextRadioStationNumber() {
        if (currentRadioStationNumber == this.maxRadioStationNumber) {
            currentRadioStationNumber = this.minRadioStationNumber;
            return;
        }
        this.currentRadioStationNumber++;
    }

    public void setPrevRadioStationNumber() {
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
    }
}

