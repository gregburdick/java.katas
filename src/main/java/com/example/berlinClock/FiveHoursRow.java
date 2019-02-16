package com.example.berlinClock;

import java.time.LocalTime;

public class FiveHoursRow {

    private String fiveHoursRow;

    public String getFiveHoursRow() { return fiveHoursRow;}

    public void setFiveHoursRow(LocalTime time) {

        int fiveHours = time.getHour() / 5;

        StringBuilder stringBuilder = new StringBuilder("OOOO");

        for(int i = 0; i < fiveHours; i++){
            stringBuilder.replace(i, i+1, "R");
        }

        fiveHoursRow = stringBuilder.toString();
    }
}
