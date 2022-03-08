package pro10_qua;

import java.util.Scanner;

public class Ec1Obj {
    double a, b;

    public Ec1Obj(double A, double B) {
        a = A;
        b = B;
    }

    public double solveLiniarEq() {
        return -b / a;
    }

    public String toString() {
        return String.format("%+10.3f X%+10.3f = 0  ->  X=%+-15.5f", a, b, solveLiniarEq());
    }

    public static void main(String[] args) {
        Ec1Obj e = new Ec1Obj(1., 2.);
        //System.out.println(e);

        Ec1Obj e1 = new Ec1Obj(6., 13.);
        Ec1Obj e2 = new Ec1Obj(61., 131.);
        Ec1Obj e3 = new Ec1Obj(23., 151.);
        //System.out.println(e1);
        //System.out.println(e2);
        //System.out.println(e3);


        Ec1Obj a[] = new Ec1Obj[10];
        for (int i = 0; i < a.length; ++i) {
            a[i] = new Ec1Obj(Math.random(), Math.random());
            System.out.printf("%5d) %s\n", i + 1, a[i]);
        }

        for (Ec1Obj x : a)
            System.out.printf("%s\n", x);
    }
}
