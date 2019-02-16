import com.example.berlinClock.SingleMinutesRow;
import java.time.LocalTime;

import org.junit.Assert;
import org.junit.Test;

public class SingleMinutesRowTests {

    @Test
    public void testGetSingleMinutesRow_zero() throws Exception {
        LocalTime testTime = LocalTime.of(00,00,00);
        String expectedValue = "OOOO";
        SingleMinutesRow smr = new SingleMinutesRow();
        smr.setSingleMinutesRow(testTime);
        String actualValue = smr.getSingleMinutesRow();
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetSingleMinutesRow_nine() throws Exception {
        LocalTime testTime = LocalTime.of(23,59,59);
        String expectedValue = "YYYY";
        SingleMinutesRow smr = new SingleMinutesRow();
        smr.setSingleMinutesRow(testTime);
        String actualValue = smr.getSingleMinutesRow();
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetSingleMinutesRow_two() throws Exception {
        LocalTime testTime = LocalTime.of(12,32,00);
        String expectedValue = "YYOO";
        SingleMinutesRow smr = new SingleMinutesRow();
        smr.setSingleMinutesRow(testTime);
        String actualValue = smr.getSingleMinutesRow();
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetSingleMinutesRow_four() throws Exception {
        LocalTime testTime = LocalTime.of(12,34,00);
        String expectedValue = "YYYY";
        SingleMinutesRow smr = new SingleMinutesRow();
        smr.setSingleMinutesRow(testTime);
        String actualValue = smr.getSingleMinutesRow();
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetSingleMinutesRow_five() throws Exception {
        LocalTime testTime = LocalTime.of(12,35,00);
        String expectedValue = "OOOO";
        SingleMinutesRow smr = new SingleMinutesRow();
        smr.setSingleMinutesRow(testTime);
        String actualValue = smr.getSingleMinutesRow();
        Assert.assertEquals(expectedValue, actualValue);
    }
}
