import com.example.berlinClock.FiveMinutesRow;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;

public class FiveMinutesRowTests {

    @Test
    public void testGetFiveMinutesRow_zero() {
        LocalTime testTime = LocalTime.of(0,0,0);
        String expectedValue = "OOOOOOOOOOO";
        FiveMinutesRow fmr = new FiveMinutesRow();
        fmr.setFiveMinutesRow(testTime);
        String actualValue = fmr.getFiveMinutesRow();
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetFiveMinutesRow_fiftyNine() {
        LocalTime testTime = LocalTime.of(23,59, 59);
        String expectedValue = "YYRYYRYYRYY";
        FiveMinutesRow fmr = new FiveMinutesRow();
        fmr.setFiveMinutesRow(testTime);
        String actualValue = fmr.getFiveMinutesRow();
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetFiveMinutesRow_four() {
        LocalTime testTime = LocalTime.of(12,04,0);
        String expectedValue = "OOOOOOOOOOO";
        FiveMinutesRow fmr = new FiveMinutesRow();
        fmr.setFiveMinutesRow(testTime);
        String actualValue = fmr.getFiveMinutesRow();
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetFiveMinutesRow_twentyThree() {
        LocalTime testTime = LocalTime.of(12,23, 0);
        String expectedValue = "YYRYOOOOOOO";
        FiveMinutesRow fmr = new FiveMinutesRow();
        fmr.setFiveMinutesRow(testTime);
        String actualValue = fmr.getFiveMinutesRow();
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetFiveMinutesrow_thirtyFive() {
        LocalTime testTime = LocalTime.of(12, 35, 0);
        String expectedValue = "YYRYYRYOOOO";
        FiveMinutesRow fmr = new FiveMinutesRow();
        fmr.setFiveMinutesRow(testTime);
        String actualValue = fmr.getFiveMinutesRow();
        Assert.assertEquals(expectedValue, actualValue);
    }
}
