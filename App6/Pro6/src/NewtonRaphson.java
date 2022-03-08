public class NewtonRaphson {
    static double x, eps;
    static int max_iter, n;

    public static double f(double x) {
        return 4. * Math.sin(x) - x + 1.;
    }
    public static double fderivat(double x) {
        final double h = 0.001;
        return (f(x + h) - f(x)) / h;
    }
    public static void main(String[] args) {
        double aux;
        x = 3.;
        max_iter = 200;
        eps = 1.e-7;

        do {
            aux = f(x) / fderivat(x);
            x -= aux;
            ++n;
        } while ((Math.abs(aux) > eps) && (n <= max_iter));
        System.out.println("Radacina aprox. (cu N-R): " + x);

        if (Math.abs(aux) >= eps) {
            System.out.println("Precizia nu e a fot atinsa in " + n + " iteratii");
        }
    }
}
