import com.company.Area;
import junit.framework.TestCase;

public class AreaTests extends TestCase {
    public void testTriangle()
    {
        var area = Area.triangleArea(3, 4);
        assertEquals(6.0, area);
        area = Area.triangleArea(5, 5);
        assertEquals(12.5, area);
    }

    public void testSquare()
    {
        var area = Area.squareArea(3);
        assertEquals(9.0, area);
        area = Area.squareArea(5);
        assertEquals(25.0, area);
    }

    public void testRectangle()
    {
        var area = Area.rectangleArea(3, 4);
        assertEquals(12.0, area);
        area = Area.rectangleArea(5, 5);
        assertEquals(25.0, area);
    }

    public void testRhombus()
    {
        var area = Area.rhombusArea(3, 4);
        assertEquals(6.0, area);
        area = Area.rhombusArea(5, 5);
        assertEquals(12.5, area);
    }
}
