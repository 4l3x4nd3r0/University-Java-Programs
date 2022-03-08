import java.util.Scanner;

public class StdStatistics {
    public static void main(String[] args) {
        int n;
        double a[]; // declare a reference variable
        Scanner in = new Scanner(System.in);

        //read number of element
        System.out.print("n: ");
        n = in.nextInt();
        
        //read vector elements
        a = new double[n]; //construct the array and store it in a
        for (int i = 0; i < n; ++i) {
            System.out.printf("a[%d]: ", i);
            a[i] = in.nextDouble();
        }

        //pritty print vector in Java
        for (int i = 0; i < a.length; ++i) {
            if (i < a.length - 1)
                System.out.printf("%f, ", a[i]);
            else
                System.out.printf("%f\n", a[i]);
        }

        //average or mean
        double sum = 0., mean;
        for (int i = 0; i < n; ++i)
            sum = sum + a[i];
        mean = sum / a.length;
        System.out.printf("mean is: %f\n", mean);

        //minimun value
        double min = a[0];
        for (int i = 1; i < n; ++i)          
            if (a[i] < min)
                min = a[i];
        System.out.printf("min is: %f\n", min);
    }
}
