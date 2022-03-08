package pckfun;

public class Ups implements IFunction {
    private double k1, k2;
    
    public String identifyMyself() {
        return "I am f(x) = k1*sin(2x)+k2*cos(x/7).";
    }

    public Ups(double a, double b) {
        k1 = a;
        k2 = b;
    }

    @Override
    public double evaluate(double x) {
        return k1 * Math.sin(2. * x) + k2 * Math.cos(x / 7.);
    }
}
