import com.example.berlinClock.*;

import java.time.LocalTime;

public class BerlinClock {
    public static void main(String args[]) throws InterruptedException {

        LocalTime terminationTime = LocalTime.now().plusSeconds(20);

        while (LocalTime.now().isBefore(terminationTime)) {
            LocalTime time = LocalTime.now();
            StringBuilder labelTime = new StringBuilder("Time: \t\t\t\t");
            System.out.println(labelTime.append(time));

            StringBuilder labelTopLamp = new StringBuilder("Top Lamp: \t\t\t");
            SecondsLamp sl = new SecondsLamp();
            sl.setSecondsLamp(time);
            String secondsLamp = sl.getSecondsLamp();
            System.out.println(labelTopLamp.append(secondsLamp));

            StringBuilder labelFiveHours = new StringBuilder("Five Hours: \t\t");
            FiveHoursRow fhr = new FiveHoursRow();
            fhr.setFiveHoursRow(time);
            String fiveHoursRow = fhr.getFiveHoursRow();
            System.out.println(labelFiveHours.append(fiveHoursRow));

            StringBuilder labelSingleHours = new StringBuilder("Single Hours: \t\t");
            SingleHoursRow shr = new SingleHoursRow();
            shr.setSingleHoursRow(time);
            String singleHoursRow = shr.getSingleHoursRow();
            System.out.println(labelSingleHours.append(singleHoursRow));

            StringBuilder labelFiveMinutes = new StringBuilder("Five Minutes Row: \t");
            FiveMinutesRow fmr = new FiveMinutesRow();
            fmr.setFiveMinutesRow(time);
            String fiveMinutesRow = fmr.getFiveMinutesRow();
            System.out.println(labelFiveMinutes.append(fiveMinutesRow));

            StringBuilder labelSingleMinutes = new StringBuilder("Single Minutes: \t");
            SingleMinutesRow smr = new SingleMinutesRow();
            smr.setSingleMinutesRow(time);
            String singleMinutesRow = smr.getSingleMinutesRow();
            System.out.println(labelSingleMinutes.append(singleMinutesRow));

            StringBuilder labelBerlinTime = new StringBuilder("Berlin Clock Time: \t");
            BerlinClockIntegrated berlinClock = new BerlinClockIntegrated();
            berlinClock.setBerlinClockIntegrated(time);
            String berlinClockIntegratedRow = berlinClock.getBerlinClockRow();
            System.out.println(labelBerlinTime.append(berlinClockIntegratedRow));

            Thread.currentThread().sleep(955);
            System.out.println();
        }
    }
}
