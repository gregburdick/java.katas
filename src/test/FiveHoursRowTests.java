import com.example.berlinClock.FiveHoursRow;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;

public class FiveHoursRowTests {

    @Test
    public void testGetFiveHoursRow_zero() {
        LocalTime testTime = LocalTime.of(0,0,0);
        String expectedValue = "OOOO";
        FiveHoursRow fmr = new FiveHoursRow();
        fmr.setFiveHoursRow(testTime);
        String actualValue = fmr.getFiveHoursRow();
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetFiveHoursRow_twentyThree() {
        LocalTime testTime = LocalTime.of(23,59, 59);
        String expectedValue = "RRRR";
        FiveHoursRow fmr = new FiveHoursRow();
        fmr.setFiveHoursRow(testTime);
        String actualValue = fmr.getFiveHoursRow();
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetFiveHoursRow_two() {
        LocalTime testTime = LocalTime.of(2,4,0);
        String expectedValue = "OOOO";
        FiveHoursRow fmr = new FiveHoursRow();
        fmr.setFiveHoursRow(testTime);
        String actualValue = fmr.getFiveHoursRow();
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetFiveHoursRow_eight() {
        LocalTime testTime = LocalTime.of(8,23, 0);
        String expectedValue = "ROOO";
        FiveHoursRow fmr = new FiveHoursRow();
        fmr.setFiveHoursRow(testTime);
        String actualValue = fmr.getFiveHoursRow();
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetFiveHoursRow_sixteen() {
        LocalTime testTime = LocalTime.of(16, 35, 0);
        String expectedValue = "RRRO";
        FiveHoursRow fmr = new FiveHoursRow();
        fmr.setFiveHoursRow(testTime);
        String actualValue = fmr.getFiveHoursRow();
        Assert.assertEquals(expectedValue, actualValue);
    }
}
