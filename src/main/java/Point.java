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
        if(p == null) {
            p = new Point(0,0);
        }
        double xLine =  Math.pow((this.x-p.x),2);
        double yLine = Math.pow((this.y-p.y),2);
        return xLine+yLine;

    }


    public boolean equals(Object o){
        if(o == null) return false;
        if(o.getClass()!=Point.class)
            return false;
        Point p=(Point) o;
        if(p.x==this.x && p.y==this.y)
            return true;
        else
            return false;
    }
}
