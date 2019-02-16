package com.example.berlinClock;

import java.time.*;

public class SingleMinutesRow {

    private String singleMinutesRow;

    public String getSingleMinutesRow() {return singleMinutesRow;}

    public void setSingleMinutesRow(LocalTime time) {

        int minutes = time.getMinute();
        if (minutes > 9) {
            String singleMinutes = Integer.toString(minutes).substring(1);
            minutes = Integer.parseInt(singleMinutes);
        }

        if (minutes > 5){
            minutes = minutes - 5;
        }

        StringBuilder stringBuilder = new StringBuilder("OOOO");

        // ToDo: consider refactoring into a switch statement? follow parallel construction;
        for (int i = 0; i < minutes; i++){

            if (minutes != 0 && minutes != 5){
                stringBuilder.replace(i, i+1,"Y");
            }
        }

        singleMinutesRow = stringBuilder.toString();
    }
}
