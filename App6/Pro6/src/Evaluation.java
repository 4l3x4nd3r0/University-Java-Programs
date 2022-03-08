public class Evaluation {
    public static void main(String[] args) {
        double x = -5;
        for (int count = 1; x <= 5.; x += 0.5, ++count)
            System.out.printf("%3d) %+5.2f %+7.5f\n", count, x, Math.sin(x) * Math.exp(-x));

        int sum = 0;
        for (int i = 1; i < 10; sum += i++)
            ;
        System.out.println("Sum is " + sum);


    }
}
