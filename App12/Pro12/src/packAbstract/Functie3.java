package packAbstract;
public class Functie3 extends FunctieA {
    public Functie3(double d, double d1, int i) {
        super(d, d1, i);
    }

    @Override
    public double functie(double x) {
        // TODO Implement this method
        return (2.*x+1)/(2.+Math.sin(x));
    }
}
