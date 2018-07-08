import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    public void testGetDistanceTo() {
        Point sourcePoint = new Point(2, 1);
        Point destinyPoint = new Point(4, 5);
        double expected = 20;
        double actual = sourcePoint.getDistance(destinyPoint);
        assertEquals(expected,actual);
    }

    @Test()
    public void testNullPointerException() {
        Point source = new Point(0, 0);
        Point destiny = null;
        assertThrows(NullPointerException.class,
                () -> {
                   source.getDistance(destiny);
                });
    }

    @Test()
    public void testIllegalStateException() {
        Point source = new Point(0,0);
        Point destiny = new Point(0,0);
        assertThrows(IllegalStateException.class,
                () -> {
                    source.getDistance(destiny);
                });
    }
}