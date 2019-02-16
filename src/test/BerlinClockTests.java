import com.example.berlinClock.BerlinClockIntegrated;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;

public class BerlinClockTests {

    @Test
    public void testBerlinClock_00_00_00() {
        LocalTime testTime = LocalTime.of(0,0,0);
        String expectedValue = "YOOOOOOOOOOOOOOOOOOOOOOO";
        BerlinClockIntegrated bci = new BerlinClockIntegrated();
        bci.setBerlinClockIntegrated(testTime);
        String actualValue = bci.getBerlinClockRow();
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testBerlinClock_23_59_59() {
        LocalTime testTime = LocalTime.of(23,59,59);
        String expectedValue = "ORRRRRRROYYRYYRYYRYYYYYY";
        BerlinClockIntegrated bci = new BerlinClockIntegrated();
        bci.setBerlinClockIntegrated(testTime);
        String actualValue = bci.getBerlinClockRow();
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testBerlinclock_16_50_06() {
        LocalTime testTime = LocalTime.of(16, 50, 6);
        String expectedValue = "YRRROROOOYYRYYRYYRYOOOOO";
        BerlinClockIntegrated bci = new BerlinClockIntegrated();
        bci.setBerlinClockIntegrated(testTime);
        String actualValue = bci.getBerlinClockRow();
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testBerlinClock_11_37_01() {
        LocalTime testTime = LocalTime.of(11, 37, 1);
        String expectedValue = "ORROOROOOYYRYYRYOOOOYYOO";
        BerlinClockIntegrated bci = new BerlinClockIntegrated();
        bci.setBerlinClockIntegrated(testTime);
        String actualValue = bci.getBerlinClockRow();
        Assert.assertEquals(expectedValue, actualValue);
    }
}
