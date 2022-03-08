public class InjumatatireV2 {
    static double a, b, x, eps, h;
    static int nmax;
    static boolean error = false;
    static String errorMsg = "";
    static int n = 100;

    public static double f(double x) {
        double xe = 15., ye = 140., l1 = 10., l2 = 12.;
        double t1, t2;
        t1 = (xe - l2 * Math.cos(x)) / l1;
        t2 = (ye - l2 * Math.sin(x)) / l1;
        return t1 * t1 + t2 * t2 - 1.;
    }

    public static double solver(double a, double b) {
        eps = 1.e-09;
        nmax = 100;

        if (Math.signum(f(a)) * Math.signum(f(b)) > 0) {
            errorMsg = ("Nu exista solutii in [" + a + "," + b + "]");
            error = true;
            return 0.;
        }

        int n = 0;
        while ((Math.abs(b - a) > eps) && (n <= nmax)) {
            x = (a + b) / 2.;
            if (f(x) == 0.) {
                errorMsg = "Radacina este: " + x;
                error = false;
                return 0;
            }
            if (Math.signum(f(a)) * Math.signum(f(x)) > 0)
                a = x;
            else
                b = x;
            ++n;
            //System.out.println("[ " +a+","+b+"] >> "+n+") "+ x);
            //System.out.printf("%3d) [%15.9f,%15.9f] > %15.9f\n", n, a, b, x);
        }
        if (n > nmax) {
            errorMsg = "Nu converge in " + n + " pasi";
            error = true;
        } else {
            errorMsg = "Radacina aprox. (cu Inj): " + x + " > " + f(x);
            error = false;
        }
        return x;
    }

    public static void main(String[] args) {
        a = -3.;
        b = 3.;
        h = (b - a) / (n - 1.);
        for (double x = a; x < b; x += h) {
            solver(x, x + h);
            if (!error)
                System.out.println(errorMsg);
        }
    }
}
