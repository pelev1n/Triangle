import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {


    @Test
    public void testIsRightTriangle() {

        List<Triangle> rightTriangles = new ArrayList<>();
        rightTriangles.add(new Triangle(new Point(0, 0), new Point(0, 3), new Point(4, 0)));
        rightTriangles.add(new Triangle(new Point(-2,-3),new Point(2,1),new Point(5,-2)));
        rightTriangles.add(new Triangle(new Point(-3,-1),new Point(3,3),new Point(-9,8)));
        rightTriangles.add(new Triangle(new Point(1,1),new Point(-2,-5),new Point(3,0)));

        for(Triangle triangle : rightTriangles) {
            assertTrue(triangle.isRightTriangle());
        }

        List<Triangle> nonRightTriangles = new ArrayList<>();
        nonRightTriangles.add(new Triangle(new Point(0,0), new Point(1,0), new Point(4,2)));
        nonRightTriangles.add(new Triangle(new Point(-2,-3),new Point(11,1),new Point(5,-2)));
        nonRightTriangles.add(new Triangle(new Point(-2,-1),new Point(2,1),new Point(5,-2)));
        nonRightTriangles.add(new Triangle(new Point(-3,-2),new Point(3,5),new Point(-9,8)));

        for (Triangle triangle : nonRightTriangles) {
            assertFalse(triangle.isRightTriangle());
        }
    }
}