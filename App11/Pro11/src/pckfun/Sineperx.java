package pckfun;

public class Sineperx implements IFunction{
    
    public String identifyMyself() {
        return String.format("I am f(x) = sin(x)/x");
    }

    @Override
    public double evaluate(double x) {
        // TODO Implement this method
        if( x == 0.)
            return 1.;
        else
        return Math.sin(x)/x;
    }
}
