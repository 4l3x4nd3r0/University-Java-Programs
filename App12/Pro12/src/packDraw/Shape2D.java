package packDraw;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class Shape2D {
    Shape shape;
    Color penColor;
    Stroke penWidth;
    boolean fill;

    public Shape2D(Color c, Stroke s, boolean f) {
        penColor = c;
        fill = f;
        penWidth = s;
    }
    
    public void setShapeColor(Color c) {
        penColor = c;
    }

    public void Line(int x1, int y1, int x2, int y2) {
        shape = new Line2D.Float(x1, y1, x2, y2);
    }

    public void Circle(double x, double y, double radius) {
        double ws = 2 * radius;
        double hs = 2 * radius;
        shape = new Ellipse2D.Double(x - ws / 2, y - hs / 2, ws, hs);
    }

    public void Rectangle(double x, double y, double w, double h) {
        shape = new Rectangle2D.Double(x, y, w, h);
    }

}
