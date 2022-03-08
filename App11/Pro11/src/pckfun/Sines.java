package pckfun;

public class Sines implements IFunction{

    public String identifyMyself() {
        return "I am sin(x)";
    }
    
    public double evaluate(double x) {
        // TODO Implement this method
        return Math.sin(x);
    }
}
