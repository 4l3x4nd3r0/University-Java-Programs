package packDesenFunctie;

public class Bisect {
    double x, a, b;
    double eps, dx;
    int k;
    Functie f;

    public Bisect(double a, double b, Functie f) {
        eps = 1.0E-12;
        k = 0;
        dx = 0;
        this.a = a;
        this.b = b;
        this.f = f;
    }

    public void solve() {
        dx = b - a;
        while (Math.abs(dx) > eps) {
            x = (a + b) / 2.;
            if (Math.signum(f.y(a)) * Math.signum(f.y(x)) < 0.F)
                b = x;
            else
                a = x;
            dx = b - a;
            k++;
            //System.out.printf("%3d] [%15.10f, %15.10f] >> %15.12f\n", k, a, b, dx);
        }
    }
 }
