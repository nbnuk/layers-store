package au.org.ala.layers.util;

import junit.framework.TestCase;
import org.junit.Test;

public class SpatialUtilTest extends TestCase {

    @Test
    public void testCalculateArea() {
        double area = 0.0;
        String wkt = "MULTIPOLYGON ZM (((-1.48088788883908 53.3594534916794 0 0,-1.48094602242846 53.3594209719146 0 0,-1.48177478413284 53.3594315385712 0 0,-1.48192216150276 53.3594335260588 0 0,-1.48185275665934 53.3597887791272 0 0,-1.48183994825107 53.3598614985616 0 0,-1.48143221252265 53.3598143206429 0 0,-1.48132291335057 53.3597574879968 0 0,-1.48088788883908 53.3594534916794 0 0)))";
        area = SpatialUtil.calculateArea(wkt); //should be 2230
        assertEquals(Math.round(area),2230);
        wkt = "POLYGON((-3.23555629603073 52.344254726829,-3.23555629603073 52.689255205215,-2.50234841421674 52.689255205215,-2.50234841421674 52.344254726829,-3.23555629603073 52.344254726829))";
        area = SpatialUtil.calculateArea(wkt); //should be 1907501493
        assertEquals(Math.round(area),1907501493);
    }
}
