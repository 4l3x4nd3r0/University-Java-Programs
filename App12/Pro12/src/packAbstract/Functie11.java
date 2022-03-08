package packAbstract;
public class Functie11 extends FunctieA{
    public Functie11(double a, double b, int n) {
        super(a,b,n);
    }
    
    @Override
    public double functie(double x) {
        return x*x-2.*x+1.;
    }
}
