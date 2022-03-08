package pro10_qua;

import java.util.Scanner;
public class Ec2Lib {
    public static double readDouble(String text) {
        Scanner in = new Scanner(System.in);
        System.out.print(text);
        return in.nextDouble();
    }

    public static String compute(double a, double b, double c) {
        double delta;
        String res;
        delta = b * b - 4. * a * c;
        res = String.valueOf((-b - Math.sqrt(delta)) / 2. / a);
        res = res + "\n" + String.valueOf((-b + Math.sqrt(delta)) / 2. / a);
        return res;
    }
    
    public static void printString(String text) {
        System.out.println(text); 
    }

    public static void main(String[] args) {       
        printString(compute(readDouble("a: "), readDouble("b: "),readDouble("c: ")));
    }
}

