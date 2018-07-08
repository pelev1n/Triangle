import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void isRightTriangle() {
        Triangle tr1 = new Triangle(new Point(-2,-3),new Point(2,1),new Point(5,-2));
        assertTrue(tr1.isRightTriangle());

        Triangle tr2 = new Triangle(new Point(-2,-3),new Point(11,1),new Point(5,-2));
        assertFalse(tr2.isRightTriangle());

        Triangle tr3 = new Triangle(new Point(-2,-1),new Point(2,1),new Point(5,-2));
        assertFalse(tr3.isRightTriangle());

        Triangle tr4 = new Triangle(new Point(-3,-1),new Point(3,3),new Point(-9,8));
        assertTrue(tr4.isRightTriangle());

        Triangle tr5 = new Triangle(new Point(-3,-2),new Point(3,5),new Point(-9,8));
        assertFalse(tr5.isRightTriangle());


        Triangle tr6 = new Triangle(new Point(1,1),new Point(-2,-5),new Point(3,0));
        assertTrue(tr6.isRightTriangle());

        Triangle tr7 = new Triangle(new Point(-1,1),new Point(-2,-5),new Point(3,0));
        assertFalse(tr7.isRightTriangle());
    }
}