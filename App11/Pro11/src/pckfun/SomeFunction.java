package pckfun;

public class SomeFunction implements IFunction{
    public String identifyMyself() {
        return "I am sin(x-1.)*x";
    }
    @Override
    public double evaluate(double x) {
        // TODO Implement this method
        return Math.sin(x-1.)*x;
    }
}
