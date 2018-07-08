import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    Point p1 = new Point(0,0);
    Point p2 = new Point(2,5);
    Point p3 = null;
    Point p4 = new Point(3,8);
    Point p5 = new Point(0,0);

    @Test
    void getDistance() {
        assertEquals(0,p1.getDistance(p3));
        assertEquals(29,p1.getDistance(p2));
        assertEquals(0,p1.getDistance(p5));
        assertEquals(10,p2.getDistance(p4));


    }

    @Test
    void equals() {
        assertFalse(p1.equals("0"));
        assertFalse(p1.equals(0.0));
        assertFalse(p2.equals(p3));
        assertFalse(p1.equals(p2));
        assertTrue(p1.equals(p5));
    }
}