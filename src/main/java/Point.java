import com.sun.istack.internal.NotNull;

import java.util.Objects;

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
        Objects.requireNonNull(p,"Point can't be null");
        if(this.equals(p)) {
            throw new IllegalStateException("Points are the same");
        }
        double xLine =  Math.pow((this.x-p.x),2);
        double yLine = Math.pow((this.y-p.y),2);
        return xLine+yLine;

    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Math.abs(x)+Math.abs(y));
    }

    public boolean equals(Object o){
        if(this == o) return true;
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
