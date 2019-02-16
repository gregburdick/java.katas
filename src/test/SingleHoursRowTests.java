import com.example.berlinClock.SingleHoursRow;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;

public class SingleHoursRowTests {

    @Test
    public void testGetSingleHourRow_zero() throws Exception {
        LocalTime testTime = LocalTime.of(00,00,00);
        String expectedValue = "OOOO";
        SingleHoursRow shr = new SingleHoursRow();
        shr.setSingleHoursRow(testTime);
        String actualValue = shr.getSingleHoursRow();
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetSingleHourRow_three() throws Exception {
        LocalTime testTime = LocalTime.of(23,59,59);
        String expectedValue = "RRRO";
        SingleHoursRow shr = new SingleHoursRow();
        shr.setSingleHoursRow(testTime);
        String actualValue = shr.getSingleHoursRow();
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetSingleHourRow_two() throws Exception {
        LocalTime testTime = LocalTime.of(2,4,0);
        String expectedValue = "RROO";
        SingleHoursRow shr = new SingleHoursRow();
        shr.setSingleHoursRow(testTime);
        String actualValue = shr.getSingleHoursRow();
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetSingleHourRow_eight() throws Exception {
        LocalTime testTime = LocalTime.of(8,23,0);
        String expectedValue = "RRRO";
        SingleHoursRow shr = new SingleHoursRow();
        shr.setSingleHoursRow(testTime);
        String actualValue = shr.getSingleHoursRow();
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetSingleHourRow_four() throws Exception {
        LocalTime testTime = LocalTime.of(14,35,0);
        String expectedValue = "RRRR";
        SingleHoursRow shr = new SingleHoursRow();
        shr.setSingleHoursRow(testTime);
        String actualValue = shr.getSingleHoursRow();
        Assert.assertEquals(expectedValue, actualValue);
    }
}
