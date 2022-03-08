package packInterface;

public class Rectangle extends Shape implements ISortable {
    Point upperleft;
    double width;
    double height;

    public Rectangle(Point p, double w, double h) {
        upperleft = p;
        width = w;
        height = h;
    }


    public double Perimeter() {
        return 2. * (width + height);
    }

    public double Area() {
        return width * height;
    }

    public String toString() {
        if (printAreaandPerimeter)
            return String.format("%s: UL(%s); w=%7.2f, h=%7.2f, P=%7.2f, A=%7.2f", getName(), upperleft, width, height,
                                 Perimeter(), Area());
        else
            return String.format("%s: UL(%s); w=%7.2f, h=%7.2f", getName(), upperleft, width, height);


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
