import com.company.LengthConverter;
import junit.framework.TestCase;

public class LengthTests extends TestCase {
    public void testMeter()
    {
        assertEquals(328.08000000000004, LengthConverter.mToFt(100));
        assertEquals(0.0621371, LengthConverter.mToMile(100));
        assertEquals(109.35999999999999, LengthConverter.mToYd(100));
    }

    public void testFeet()
    {
        assertEquals(30.48, LengthConverter.ftToM(100));
    }

    public void testMile()
    {
        assertEquals(160934.0, LengthConverter.mileToM(100));
    }

    public void testYard()
    {
        assertEquals(91.44, LengthConverter.ydToM(100));
    }
}
