import java.util.Scanner;

public class Polar {
    public static void main(String[] args) {
        double x, y, r, th;
        Scanner in = new Scanner(System.in);

        System.out.print("x =");
        x = in.nextDouble();
        System.out.print("y =");

        y = in.nextDouble();
        r = Math.sqrt(x * x + y * y);
        th = Math.atan2(y, x);
        System.out.printf("(%.4f,%.4f) -> (%.4f,%.4f\u00B0)\n", x, y, r, Math.toDegrees(th));
    }
}
