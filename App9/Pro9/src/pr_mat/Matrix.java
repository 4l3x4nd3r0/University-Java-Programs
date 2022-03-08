import java.util.Scanner;

public class Matrix {

    public static int readInt(String txt) {
        Scanner in = new Scanner(System.in);
        System.out.print(txt);
        return in.nextInt();
    }

    public static double readDouble(String txt) {
        Scanner in = new Scanner(System.in);
        System.out.print(txt);
        return in.nextDouble();
    }

    public static double[][] readMatrix() {
        int i, j, r, c;
        Scanner in = new Scanner(System.in);
        r = readInt("r=");
        c = readInt("c=");
        double[][] M = new double[r][c];
        for (i = 0; i < r; ++i)
            for (j = 0; j < c; ++j) {
                System.out.printf("M[%2d, %2d] =", i + 1, j + 1);
                M[i][j] = in.nextDouble();
            }
        return M;
    }

    public static void writeMatrix(double[][] M) {
        int i, j, r, c;
        for (i = 0; i < M.length; ++i) {
            for (j = 0; j < M[i].length; ++j)
                System.out.printf("%5.1f ", M[i][j]);
            System.out.println(); //        ^ 2 spaces there
        }
    }


    public static double[][] addMatrix(double[][] A, double[][] B) {
        int i, j;
        double[][] err = { { 0. }, { 0. } };

        if ((A.length != B.length) || (A[0].length != B[0].length)) {
            System.out.println("\n***Addition not possible.\nrow and column numbers must be the same!***");
            System.exit(0);
            return err;
        }

        double[][] R = new double[A.length][A[0].length];
        for (i = 0; i < A.length; ++i)
            for (j = 0; j < A[i].length; ++j)
                R[i][j] = A[i][j] + B[i][j];

        return R;
    }

    public static double[][] minusMatrix(double[][] A, double[][] B) {
        int i, j;
        double[][] err = { { 0. }, { 0. } };

        if ((A.length != B.length) || (A[0].length != B[0].length)) {
            System.out.println("\n***Addition not possible.\nrow and column numbers must be the same!***");
            System.exit(0);
            return err;
        }

        double[][] R = new double[A.length][A[0].length];
        for (i = 0; i < A.length; ++i)
            for (j = 0; j < A[i].length; ++j)
                R[i][j] = A[i][j] - B[i][j];

        return R;
    }

    public static double[][] multMatrix(double[][] A, double[][] B) {
        int i, j, k, rr, cr;
        double[][] err = { { 0. }, { 0. } };

        if (A[0].length != B.length) {
            System.out.println("\n***Multiplication is not possible.\nA columns and B rows must be the same!***");
            System.exit(0);
            return err;
        }

        rr = A.length;
        cr = B[0].length;

        double[][] R = new double[rr][cr];
        for (i = 0; i < rr; ++i)
            for (j = 0; j < cr; ++j) {
                R[i][j] = 0.;
                for (k = 0; k < B.length; ++k)
                    R[i][j] += A[i][k] * B[k][j];
            }

        return R;
    }


    public static double[][] scalarMultMatrix(double[][] A, double c) {
        int i, j;
        double[][] R = new double[A.length][A[0].length];
        for (i = 0; i < A.length; ++i)
            for (j = 0; j < A[0].length; ++j)
                R[i][j] = c * A[i][j];
        return R;
    }
    
    
    public static double[][] transpMatrix(double[][] A) {
        int i, j;
        double[][] R = new double[A[0].length][A.length];
        for (i = 0; i < A[0].length; ++i)
            for (j = 0; j < A.length; ++j)
                R[i][j] = A[j][i];
        return R;
    }

    public static void main(String[] args) {
        double M[][], M1[][], M2[][], M3[][], A[][], B[][];
        A = readMatrix();
        System.out.println("");
        writeMatrix(A);
        System.out.println("");
        writeMatrix(transpMatrix(A));
        System.out.println("");
        writeMatrix(transpMatrix(transpMatrix(A)));
        
        B = readMatrix();
        M = addMatrix(A, B);
        M1 = minusMatrix(A, B);
        M2 = multMatrix(A, B);
        M3 = multMatrix(B, A);


        writeMatrix(A);
        System.out.println("+");
        writeMatrix(B);
        System.out.println("=");
        writeMatrix(M);
        System.out.println();

        writeMatrix(A);
        System.out.println("-");
        writeMatrix(B);
        System.out.println("=");
        writeMatrix(M1);
        System.out.println();


        writeMatrix(A);
        System.out.println("x");
        writeMatrix(B);
        System.out.println("=");
        writeMatrix(M2);
        System.out.println();
        
        
        writeMatrix(B);
        System.out.println("x");
        writeMatrix(A);
        System.out.println("=");
        writeMatrix(M3);
        System.out.println();
    }
}
