import com.company.WeightConverter;
import junit.framework.TestCase;

public class WeightTests extends TestCase {
    public void testMetric()
    {
        assertEquals(1000000.0, WeightConverter.kgToMg(1));
        assertEquals(1000.0, WeightConverter.kgToGram(1));
        assertEquals(53.0, WeightConverter.kgToKg(53.0));
        assertEquals(1.0, WeightConverter.kgToTonne(1000));
    }

    public void testImperial()
    {
        assertEquals(35.274, WeightConverter.kgToOunce(1));
        assertEquals(2.205, WeightConverter.kgToPound(1));
    }
}
