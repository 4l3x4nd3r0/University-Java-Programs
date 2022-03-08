package packAbstract;
public class FAlta extends FunctieA {
    public FAlta(double a, double b, int n) {
        super(a,b,n);
    }
    @Override
    public double functie(double x) {
        // TODO Implement this method
        return x*x*Math.sin(x)-x-1;
    }
}
