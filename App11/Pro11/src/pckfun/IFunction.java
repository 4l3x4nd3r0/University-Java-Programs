package pckfun;

public interface IFunction {
    default public String identifyMyself() {
        return "I am no function.";
    }

    public double evaluate(double x);
}
