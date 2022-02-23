import com.company.CurrencyConverter;
import junit.framework.TestCase;

public class CurrencyTests extends TestCase {
    public void testUAH(){
        assertEquals(CurrencyConverter.convertUAHtoEUR(100), 3.0);
        assertEquals((int)(CurrencyConverter.convertUAHtoUSD(100) * 10), 34);
        assertEquals(CurrencyConverter.convertUAHtoGBP(100), 2.5);
    }
    public void testUSD(){
        assertEquals(CurrencyConverter.convertUSDtoEUR(100), 88.0);
        assertEquals(CurrencyConverter.convertUSDtoUAH(100), 2936.0);
        assertEquals(CurrencyConverter.convertUSDtoGBP(100), 74.0);
    }
    public void testGBP(){
        assertEquals(CurrencyConverter.convertGBPtoEUR(100), 120.0);
        assertEquals(CurrencyConverter.convertGBPtoUSD(100), 135.0);
        assertEquals(CurrencyConverter.convertGBPtoUAH(100), 3979.0);
    }
    public void testEUR(){
        assertEquals(CurrencyConverter.convertEURtoUAH(100), 3322.0);
        assertEquals(CurrencyConverter.convertEURtoUSD(100), 112.99999999999999);
        assertEquals(CurrencyConverter.convertEURtoGBP(100), 83.0);
    }
}
