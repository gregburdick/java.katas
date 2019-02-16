package com.example.berlinClock;

import java.time.LocalTime;

public class BerlinClockIntegrated {

    private String berlinClockRow;

    public String getBerlinClockRow() {
        return berlinClockRow;
    }

    public void setBerlinClockIntegrated(LocalTime time) {

        SecondsLamp sl = new SecondsLamp();
        sl.setSecondsLamp(time);
        String secondsLamp = sl.getSecondsLamp();

        FiveHoursRow fhr = new FiveHoursRow();
        fhr.setFiveHoursRow(time);
        String fiveHoursRow = fhr.getFiveHoursRow();

        SingleHoursRow shr = new SingleHoursRow();
        shr.setSingleHoursRow(time);
        String singleHoursRow = shr.getSingleHoursRow();

        FiveMinutesRow fmr = new FiveMinutesRow();
        fmr.setFiveMinutesRow(time);
        String fiveMinutesRow = fmr.getFiveMinutesRow();

        SingleMinutesRow smr = new SingleMinutesRow();
        smr.setSingleMinutesRow(time);
        String singleMinutesRow = smr.getSingleMinutesRow();

        StringBuilder berlinClock = new StringBuilder();
        berlinClockRow = berlinClock.append(secondsLamp)
                .append(fiveHoursRow)
                .append(singleHoursRow)
                .append(fiveMinutesRow)
                .append(singleMinutesRow).toString();
    }
}
