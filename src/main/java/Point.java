public class Point {
    private int x,y;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public double getDistance(Point p) {
        double xLine =  Math.pow((this.x-p.x),2);
        double yLine = Math.pow((this.y-p.y),2);
        return xLine+yLine;

    }
}
