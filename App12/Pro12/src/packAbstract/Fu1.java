package packAbstract;
public class Fu1 extends FunctieA {
    public Fu1(double a, double b, int n) {
        super(a,b,n);
    }
    @Override
    public double functie(double x) {
        // TODO Implement this method
        return x*x/2.;
    }
}
