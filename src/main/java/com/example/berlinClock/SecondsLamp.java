package com.example.berlinClock;

import java.time.LocalTime;

public class SecondsLamp {

    private String secondsLamp;

    public String getSecondsLamp() {
        return secondsLamp;
    }

    public void setSecondsLamp(LocalTime time){

        int seconds = time.getSecond();
        secondsLamp = "O";

        if ((seconds % 2) == 0){
            secondsLamp = "Y";
        }
    }
}
