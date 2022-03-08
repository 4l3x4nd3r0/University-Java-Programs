package pr_mat;
import java.util.Scanner;
public class MatStr {
    public static void main(String[] args) {
        int i, j, n, m;
        double[][] M;

        Scanner intrare = new Scanner(System.in);
        System.out.print("n=");
        n = intrare.nextInt();
        System.out.print("m=");
        m = intrare.nextInt();

        M = new double[m][n];

        for (i = 0; i < m; ++i)
            for (j = 0; j < n; ++j) {
                System.out.printf("M[%2d, %2d] =", i + 1, j + 1);
                M[i][j] = intrare.nextDouble();
            }

        for (i = 0; i < M.length; ++i) {
            for (j = 0; j < M[i].length; ++j)
                System.out.printf("%5.1f  ", M[i][j]);
            System.out.println();
        }

        //ma el > 0

        int contor = 0;
        double ma = 0.;

        for (i = 0; i < m; ++i)
            for (j = 0; j < n; ++j)
                if (M[i][j] > 0.) {
                    ma = ma + M[i][j];
                    ++contor;
                }
        System.out.println("ma = "+ma/contor);
        

        for (i = 0; i < M.length; ++i) {
            for (j = 0; j < M[i].length; ++j)
                if (!(M[i][j] > 0.))
                    System.out.printf(" ***** ");
                else
                    System.out.printf("%5.1f  ", M[i][j]);
            System.out.println();
        }
        
        double mg = 1.;
        contor=0;
        for (i = 0; i < m; ++i)
            for (j = 0; j < n; ++j)
                if (M[i][j] > 0.) {
                    mg = mg * M[i][j];
                    ++contor;
                }
        System.out.println("mg = "+Math.pow(mg, 1./contor));

    }
}
