package com.example.berlinClock;

import java.time.LocalTime;

public class SingleHoursRow {

    private String singleHoursRow;

    public String getSingleHoursRow() {return singleHoursRow;}

    public void setSingleHoursRow(LocalTime time){

        int hours = time.getHour();
        if (hours > 9){
            String singleHours = Integer.toString(hours).substring(1);
            hours = Integer.parseInt(singleHours);
        }

        // ToDo: abstract the following into a separate method, i.e., getSingleTimePeriod();
        if (hours > 5){
            hours = hours - 5;
        }

        StringBuilder stringBuilder = new StringBuilder("OOOO");
        String result;

        for (int i = 0; i < hours; i++){
            if (hours != 0 && hours != 5){
                stringBuilder.replace(i, i+1, "R");
            }
        }

        singleHoursRow = stringBuilder.toString();
    }
}
