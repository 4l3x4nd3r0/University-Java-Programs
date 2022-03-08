package packAbstract;
public class Functie2 extends FunctieA {
    public Functie2(double a, double b, int n) {
        super(a,b,n);
    }
    @Override
    public double functie(double x) {
        return Math.sin(x)/x;
    }
}
