package packAbstract;

public class BaD extends FunctieA {
    public BaD(double d, double d1, int i) {
        super(d, d1, i);
    }

    public static void main(String[] args) {
        BaD baD = new BaD(-10., 10., 91);
        baD.afisare();
    }

    @Override
    public double functie(double x) {
        // TODO Implement this method
        return x*Math.sin(1+Math.cos(x));
    }
}
