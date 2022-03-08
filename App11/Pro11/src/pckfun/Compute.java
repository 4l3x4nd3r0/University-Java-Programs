package pckfun;

public class Compute {
    public void Print(IFunction f, double a, double b, int n) {
        double x, h = (b - a) / n;
        System.out.println(f.identifyMyself());
        System.out.printf("  i           x            f(x)\n");
        System.out.printf("----------------------------------\n");
        for (int i = 0; i <= n; ++i) {
            x = a + i * h;
            System.out.printf("%3d)  %12.7f  %12.7f\n", i + 1, x, f.evaluate(x));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Compute c = new Compute();
        IFunction f, f1, f2, f3, f4, f5, f6, f7, f8;

        IFunction af1[] = new IFunction[100];

        f1 = new LiniarEquation(1., 1.);
        f2 = new QuadraticEquation(1., -2., 1);
        f3 = new Sines();
        f4 = new SomeFunction();
        f5 = new Sineperx();
        f6 = new NewFunction();
        f7 = new AnotherFunction();
        f8 = new Ups(1., 2.);

        c.Print(f1, -10, 10, 10);
        c.Print(f2, -10, 10, 10);
        c.Print(f3, -10, 10, 10);
        c.Print(f4, -10, 10, 10);
        c.Print(f5, -10, 10, 10);
        c.Print(f6, -10, 10, 10);
        c.Print(f7, -10, 10, 10);
        c.Print(f8, -10, 10, 10);


        for (int i = 0; i < af1.length; ++i)
            switch (i % 8) {
            case 0:
                af1[i] = new LiniarEquation(Math.random(), Math.random());
                break;
            case 1:
                af1[i] = new QuadraticEquation(Math.random(), Math.random(), Math.random());
                break;
            case 2:
                af1[i] = new Sineperx();
                break;
            case 3:
                af1[i] = new SomeFunction();
                break;
            case 4:
                af1[i] = new NewFunction();
                break;
            case 5:
                af1[i] = new Sines();
                break;
            case 6:
                af1[i] = new AnotherFunction();
                break;

            case 7:
                af1[i] = new Ups(Math.random(), Math.random());
                break;

            }

        for (IFunction x : af1)
            c.Print(x, -1, 1, 10);
    }
}
