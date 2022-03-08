package pckfun;

public class AnotherFunction implements IFunction {
    public String identifyMyself() {
        return "I am f(x) = x.";
    }
    @Override
    public double evaluate(double x) {
        // TODO Implement this method
        return x;
    }
}
