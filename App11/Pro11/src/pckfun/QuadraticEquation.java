package pckfun;

public class QuadraticEquation implements IFunction{
    double a,b,c;
    
    public String identifyMyself() {
        return String.format("I am f(x) = %f*x^2%+fx%+f",a,b,c);
    }
    
    public QuadraticEquation(double a0, double b0, double c0) {
        a=a0;
        b=b0;
        c=c0;
    }
    
    public  double evaluate(double x) {
        return a*x*x+b*x+c;
    }
}
