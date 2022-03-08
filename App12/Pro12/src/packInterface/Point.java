package packInterface;

public class Point {
    double x, y;
    
    public Point(double x, double y) {
        this.x=x;
        this.y=y;
    }
    
    public double distance (Point p) {
        return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
    }
    
    public String toString(){
        return String.format("%5.2f,%5.2f",x,y);
    }
}
