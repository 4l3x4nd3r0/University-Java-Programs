package pro10_qua;

public class Ec2Obj {
    private double a, b, c, x1, x2, re, im;
    private String sol;
    private boolean isReal;

    public boolean isReal() {
        return isReal;
    }

    public void setA(double a) {
        this.a = a;
        sol = compute();
        System.out.println("\na cofficient was set to:"+a);
    }

    public void setB(double b) {
        this.b = b;
        sol = compute();
        System.out.println("\nb cofficient was set to:"+b);
    }

    public void setC(double c) {
        this.c = c;
        sol = compute();
        System.out.println("\nc cofficient was set to:"+c);
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public Ec2Obj(double A, double B, double C) {
        a = A;
        b = B;
        c = C;
        sol = compute();
    }

    public String compute() {
        double delta;

        String res = "";
        isReal = true;
        if (a != 0.) {
            delta = b * b - 4. * a * c;
            res = String.format("\n%.1fx^2%+.1fx%+.1f = 0\n", a, b, c);
            if (delta >= 0.) {             
                x1 = (-b + Math.sqrt(delta)) / 2. / a;
                x2 = (-b - Math.sqrt(delta)) / 2. / a;
                res += String.format("x1=%.10f\nx2=%.10f", x1, x2);
            } else {
                isReal = false;
                re = -b / 2. / a;
                im = Math.abs(Math.sqrt(-delta) / 2. / a);
                res += String.format("z1=%.10f+%.10fi\n", re, im);
                res += String.format("z2=%.10f-%.10fi", re, im);
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
        return sol;
    }


}

