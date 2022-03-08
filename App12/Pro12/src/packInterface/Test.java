package packInterface;

public class Test {
    public static void main(String[] args) {
        Point p = new Point(2., 3.);
        Point p1 = new Point(12., 3.);
        Point p2 = new Point(2., 13.);

        Circle c1 = new Circle(p, 1.);
        c1.setName("Circle1");
        Circle c2 = new Circle(p1, 20.);
        Circle c3 = new Circle(p2, 10.);

        Rectangle r1 = new Rectangle(p, 12., 13.);
        Rectangle r2 = new Rectangle(p1, 2., 3.);
        r2.setName("Rangle2");
        Rectangle r3 = new Rectangle(p2, 21., 31.);
        r3.setName("Rangle3");


        Shape aOfshapes[] = new Shape[6];

        aOfshapes[0] = c1;
        aOfshapes[1] = c2;
        aOfshapes[2] = c3;
        aOfshapes[3] = r1;
        aOfshapes[4] = r2;
        aOfshapes[5] = r3;
        

        //Shape.printAreaandPerimeter = false;

        for (Shape s : aOfshapes)
            if ((s != null) & (s instanceof Circle))
                System.out.printf("%s\n", s);
        
        System.out.println();

        double A = 0.;
        for (Shape s : aOfshapes)
            if (s != null)
                A += s.Area();
        
        System.out.println("Total of areas is: " + A);
        System.out.println();
              
        ISortable aOfsortable[] = new ISortable[6];

        for (int i = 0; i < aOfshapes.length; ++i)
            aOfsortable[i] = (ISortable) aOfshapes[i];

        for (ISortable s : aOfsortable)
            if (s != null) {
                System.out.printf("%s\n", s);
        }
        System.out.println("\n");

        Sort.selectionSort(aOfsortable);

        for (ISortable s : aOfsortable)
            if (s != null) {
                System.out.printf("%s\n", s);
            }
        System.out.println();
    }
}
