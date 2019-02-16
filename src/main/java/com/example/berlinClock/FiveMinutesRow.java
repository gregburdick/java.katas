package com.example.berlinClock;

import java.time.LocalTime;

public class FiveMinutesRow {

    private String fiveMinutesRow;

    public String getFiveMinutesRow() {return fiveMinutesRow;}

    public void setFiveMinutesRow(LocalTime time){

        int fiveMinutes = time.getMinute() / 5;

        StringBuilder stringBuilder = new StringBuilder("OOOOOOOOOOO");

        for (int i = 0; i < fiveMinutes; i++){
            switch (i){
                case 2: case 5: case 8: stringBuilder.replace(i, i+1, "R");
                break;
                default: stringBuilder.replace(i, i+1, "Y");
            }
        }

        fiveMinutesRow = stringBuilder.toString();
    }
}
