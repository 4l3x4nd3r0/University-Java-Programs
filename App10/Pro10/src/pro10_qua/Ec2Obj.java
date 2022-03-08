package pro10_qua;

import pro10_lin.Ec1Obj;

public class Ec2Obj {
    double a, b, c;
    private String sol;

    public Ec2Obj(double A, double B, double C) {
        a = A;
        b = B;
        c = C;
    }

    public String compute() {
        double delta, x1, x2, re, im;
        
        String res = "";
        if (a != 0.) {
            delta = b * b - 4. * a * c;
            res = String.format("%.1fx^2%+.1fx%+.1f = 0\n", a, b, c);
            if (delta >= 0.) {
                x1 = (-b + Math.sqrt(delta)) / 2. / a;
                x2 = (-b - Math.sqrt(delta)) / 2. / a;
                res += String.format("x1=%.10f\nx2=%.10f\n\n", x1, x2);
            } else {
                re = -b / 2. / a;
                im = Math.abs(Math.sqrt(-delta) / 2. / a);
                res += String.format("z1=%.10f+%.10fi\n", re, im);
                res += String.format("z2=%.10f-%.10fi\n\n", re, im);
            }
        } else {
            if (b != 0.) {
                res += String.format("%.1fx%+.1f = 0\n", b, c);
                x1 = -c / b;
                res += String.format("x=%.10f\n\n", x1);
            } else {
                if (c != 0.) {
                    res += String.format("%+.1f = 0\n", c);
                    res += "Not an equation!\n\n";
                } else {
                    res += "0 = 0\nTrue\n\n";
                }
            }
        }
        return res;
    }

    public String toString() {
        return compute();
    }

    public static void main(String[] args) {
        Ec2Obj x = new Ec2Obj(1., 2., 1.);
        System.out.println(x);
        Ec2Obj x1 = new Ec2Obj(1., 2., 100.);
        System.out.println(x1);
        Ec2Obj x2 = new Ec2Obj(0., 0., 100.);
        System.out.println(x2);
        
        
        Ec2Obj a[] = new Ec2Obj[3];
        for (int i = 0; i < a.length; ++i) {
            a[i] = new Ec2Obj(Math.sin(i), i * Math.random(), i);
            System.out.printf("%5d) %s\n", i + 1, a[i]);
        }
        
        
    }
}

