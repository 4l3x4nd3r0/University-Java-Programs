package pckfun;

public class NewFunction implements IFunction {
     public String identifyMyself() {
        return "I am f(x) = e^-x^2 cos(x).";
    }
    
    @Override
    public double evaluate(double x) {
        // TODO Implement this method
        return Math.exp(-x*x)*Math.cos(x);
    }
}
