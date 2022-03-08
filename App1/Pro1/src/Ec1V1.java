import java.util.Scanner;

public class Ec1V1 {
    public static void main(String[] args) {
        double a, b, x;
        Scanner in = new Scanner(System.in);

        System.out.print("a: ");
        a = in.nextDouble();
        System.out.print("b: ");
        b = in.nextDouble();

        x = -b / a;

        System.out.print("Solutia ecuatiei " + a + "x +" + b + "=0 este x:" + x);
    }
}
