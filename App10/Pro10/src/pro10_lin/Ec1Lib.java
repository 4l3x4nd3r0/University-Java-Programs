package pro10_lin;
import java.util.Scanner;
public class Ec1Lib {
    
    public static double readDouble(String txt) {
        Scanner in = new Scanner(System.in);
        System.out.print(txt);
        return in.nextDouble();       
    }
    
    public static double solveLiniarEq(double a, double b) {
        return -b/a;       
    }
     
    public static void printLiniarEq(double a, double b) {
        System.out.print("Solutia ecuatiei " + a + "x +" + b + "=0 este x:" + solveLiniarEq(a,b));      
    }

    public static void main(String[] args) {
        printLiniarEq(readDouble("a: "),readDouble("b: "));
    }
}
