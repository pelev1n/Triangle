public class Triangle {
    private Point p1, p2, p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public boolean isRightTriangle() {
        double firstD =  p1.getDistance(p2);
        double secD = p2.getDistance(p3);
        double thirdD = p1.getDistance(p3);
        if( firstD + secD == thirdD)
            return true;
        if(firstD + thirdD == secD)
            return true;
        if(secD + thirdD == firstD)
            return true;

        return false;
    }


    @Override
    public String toString() {
        return "p1: "+ p1 + ", p2:"+ p2 +", p3:"+ p3;

    }
}
