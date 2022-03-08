package pckfun;

public class LiniarEquation implements IFunction{
    double a,b;
    
    public String identifyMyself() {
        return String.format("I am f(x) = %+f*x%+f",a,b);
    }
    
    public LiniarEquation(double a0, double b0) {     
        a=a0;
        b=b0;
    }
    
    public  double evaluate(double x) {
        return a*x+b;
    }
}
