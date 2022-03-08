public class Simpson {
    public static double a, b, h, s, x;
    public static int i, n;

    public static double f(double x) {
        return Math.sqrt(1 - x * x);
    }

    public static void main(String[] args) {
        a = 0;
        b = 0.5;
        n = 100;

        h = (b - a) / 2. / n;
        s = (f(b) + f(a)) / 2.;
        x = a;
        for (i = 1; i < n; ++i) {
            x += h;
            s += 2 * f(x);
            x += h;
            s += f(x);
        }
        x +=  h;
        s += 2. * f(x);
        s *= 2 * h / 3.;
        System.out.println("Valoarea integralei(cu S): " + s);
    }
}
