package packAbstract;
public class Functie1 extends FunctieA {
    public Functie1(double a, double b, int n) {
        super(a,b,n);
    }    
    @Override
    public double functie(double x) {
            return Math.sin(x)*Math.cos(x/2.) ;
    }
}
