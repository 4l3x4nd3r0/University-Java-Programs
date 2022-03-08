package pr_mat;
import java.util.Scanner;

public class mat1 {
    int i, j, r, c;
    double[][] M;

    public mat1(int r, int c) {
        this.r = r;
        this.c = c;
        M = new double[r][c];
    }

    public mat1(double[][] data) {
        r = data.length;
        c = data[0].length;
        M = new double[r][c];
        for (i = 0; i < r; ++i)
            for (j = 0; j < c; ++j)
                M[i][j] = data[i][j];
    }

    public void matR() {
        Scanner intrare = new Scanner(System.in);
        for (i = 0; i < r; ++i)
            for (j = 0; j < c; ++j) {
                System.out.printf("M[%2d, %2d] =", i + 1, j + 1);
                M[i][j] = intrare.nextDouble();
            }
        System.out.println();
    }

    public void matW() {
        for (i = 0; i < M.length; ++i) {
            for (j = 0; j < M[i].length; ++j)
                System.out.printf("%5.1f  ", M[i][j]);
            System.out.println();
        }
    }

    public mat1 addM(mat1 m1) {
        mat1 res = new mat1(r, c);

        if ((r != m1.r) || (c != m1.c))
            throw new RuntimeException("Row and cols must be the same to add!\n");

        for (i = 0; i < M.length; ++i)
            for (j = 0; j < M[i].length; ++j)
                res.M[i][j] = M[i][j] + m1.M[i][j];

        return res;
    }

    public mat1 subM(mat1 m1) {
        mat1 res = new mat1(r, c);

        for (i = 0; i < M.length; ++i)
            for (j = 0; j < M[i].length; ++j)
                res.M[i][j] = M[i][j] - m1.M[i][j];

        return res;
    }

    public mat1 proM(mat1 m1) {
        if ((c != m1.r))
            throw new RuntimeException("Cols and rwos must be the same to multiply!\n");
        mat1 res = new mat1(r, m1.c);

        for (i = 0; i < r; ++i)
            for (j = 0; j < m1.c; ++j)
                for (int k = 0; k < c; ++k)
                    res.M[i][j] += M[i][k] * m1.M[k][j];

        return res;
    }

    public boolean eqM(mat1 m1) {
        if ((r != m1.r) || (c != m1.c))
            throw new RuntimeException("Row and cols must be the same to compare!\n");
        for (i = 0; i < M.length; ++i)
            for (j = 0; j < M[i].length; ++j)
                if (M[i][j] != m1.M[i][j])
                    return false;
        return true;
    }


}

