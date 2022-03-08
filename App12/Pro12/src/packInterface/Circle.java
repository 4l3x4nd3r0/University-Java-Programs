package packInterface;

import java.awt.Rectangle;

public class Circle extends Shape implements ISortable {
    Point centru;
    double raza;

    public Circle(Point p, double r) {
        centru = p;
        raza = r;
    }

    @Override
    public double Perimeter() {
        // TODO Implement this method
        return 2. * Math.PI * raza;
    }

    @Override
    public double Area() {
        // TODO Implement this method
        return Math.PI * raza * raza;
    }

    public String toString() {
        if (printAreaandPerimeter)
            return String.format("%s:  C(%s); r=%7.2f             P=%7.2f, A=%7.2f", getName(), centru, raza, Perimeter(),
                                 Area());
        else
            return String.format("%s:  C(%s); r=%7.2f           ", getName(), centru, raza);

    }

    @Override
    public int compareTo(Object b) {
        Shape oneToCompare = (Shape) b;
        if (Area() < oneToCompare.Area())
            return -1; // this one is smaller
        if (Area() > oneToCompare.Area())
            return 1; // this one is larger
        return 0; // they are the same

    }
}
