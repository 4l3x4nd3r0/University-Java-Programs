package pr_mat;

import pr_complex.*;

public class TestComplex {
    public static void main(String[] args) {
        Complex a = new Complex(5.0, 6.0);   //z0
        Complex b = new Complex(-3.0, 4.0);  //z1

        System.out.println("a            = " + a);
        System.out.println("b            = " + b);
        System.out.println("Re(a)        = " + a.re());
        System.out.println("Im(a)        = " + a.im());
        System.out.println("b + a        = " + b.plus(a));
        System.out.println("a - b        = " + a.minus(b));
        System.out.println("a * b        = " + a.times(b));
        System.out.println("b * a        = " + b.times(a));
        System.out.println("a / b        = " + a.divides(b));
        System.out.println("(a / b) * b  = " + a.divides(b).times(b));
        System.out.println("conj(a)      = " + a.conjugate());
        System.out.println("|a|          = " + a.abs());
        System.out.println("tan(a)       = " + a.tan());
        
        Quaternion q1 = new Quaternion(3.0, 1.0, 0.0, 0.0);
        System.out.println("a = " + a);

        Quaternion q2 = new Quaternion(0.0, 5.0, 1.0, -2.0);
        System.out.println("b = " + b);

        System.out.println("norm(q1)  = " + q1.norm());
        System.out.println("conj(q1)  = " + q1.conjugate());
        System.out.println("a + b    = " + q1.plus(q2));
        System.out.println("a * b    = " + q1.times(q2));
        System.out.println("b * a    = " + q2.times(q1));
        System.out.println("a / b    = " + q1.divides(q2));
        System.out.println("a^-1     = " + q1.inverse());
        System.out.println("a^-1 * a = " + q1.inverse().times(q2));
        System.out.println("a * a^-1 = " + q1.times(q2.inverse()));
    }
}
