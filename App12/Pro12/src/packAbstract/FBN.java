package packAbstract;
public class FBN extends FunctieA {
    public FBN(double a, double b, int n) {
        super(a,b,n);
    }
    @Override
    public double functie(double x) {
        // TODO Implement this method
        return Math.exp(-x)*Math.sin(x/4.);
    }
}
