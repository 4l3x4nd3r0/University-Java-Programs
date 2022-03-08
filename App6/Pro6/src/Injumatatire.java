public class Injumatatire {
    static double a, b, x, eps;
    static int nmax;

    public static double f(double x) {
        return  4. * Math.sin(x) - x + 1.;
    }

    public static void main(String[] args) {
        a = -3.;
        b = 3.;
        eps = 1.e-14;
        nmax = 100;

        if (Math.signum(f(a)) * Math.signum(f(b)) > 0) {
            System.out.println("Nu exista solutii in [" + a + "," + b + "]");
            return;
        }

        int n = 0;
        while ((Math.abs(b - a) > eps) && (n <= nmax)) {
            x = (a + b) / 2.;
            if (f(x) == 0) {
                System.out.println("Radacina este: " + x);
                System.exit(0);
            }
            if (Math.signum(f(a)) * Math.signum(f(x)) > 0)
                a = x;
            else
                b = x;
            ++n;
            //System.out.println("[ " +a+","+b+"] >> "+n+") "+ x);
            System.out.printf("%3d) [%15.9f,%15.9f] > %15.9f\n",n,a,b,x);
        }
        if (n > nmax)
            System.out.println("Nu converge in " + n + " pasi");
        else
            System.out.println("Radacina aprox. (cu Inj): " + x +" > "+f(x));
    }
}
