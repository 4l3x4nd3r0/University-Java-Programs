package packException;

import java.util.InputMismatchException;

public class TestExceptii {
    public static void main(String[] args) {
        Functie_Exception F1 = new Functie_Exception();
        double x1, x2;

        try {
            System.out.print("x1=");
            x1 = F1.citeste_real();
            System.out.print("x2=");
            x2 = F1.citeste_real();

            for (double x = x1; x <= x2; x += 1.) {
                try {
                    System.out.printf("%6.3f %10.7f\n", x, F1.F(x));
                } catch (ArithmeticException e) {
                    System.out.printf("%6.3f %s\n", x, e);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Gata ..." + e);
        }
    }
}
