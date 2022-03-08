package pr_mat;

import java.util.Scanner;

public class MatObj {
    int i, j, r, c;
    double[][] M;

    public MatObj(int r, int c) {
        this.r = r;
        this.c = c;
        M = new double[r][c];
    }

    public MatObj(double[][] data) {
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

    public MatObj addM(MatObj m1) {
        MatObj res = new MatObj(r, c);

        if ((r != m1.r) || (c != m1.c))
            throw new RuntimeException("Row and cols must be the same to add!\n");

        for (i = 0; i < M.length; ++i)
            for (j = 0; j < M[i].length; ++j)
                res.M[i][j] = M[i][j] + m1.M[i][j];

        return res;
    }

    public MatObj subM(MatObj m1) {
        MatObj res = new MatObj(r, c);

        for (i = 0; i < M.length; ++i)
            for (j = 0; j < M[i].length; ++j)
                res.M[i][j] = M[i][j] - m1.M[i][j];

        return res;
    }

    public MatObj proM(MatObj m1) {
        if ((c != m1.r))
            throw new RuntimeException("Cols and rwos must be the same to multiply!\n");
        MatObj res = new MatObj(r, m1.c);

        for (i = 0; i < r; ++i)
            for (j = 0; j < m1.c; ++j)
                for (int k = 0; k < c; ++k)
                    res.M[i][j] += M[i][k] * m1.M[k][j];

        return res;
    }

    public boolean eqM(MatObj m1) {
        if ((r != m1.r) || (c != m1.c))
            throw new RuntimeException("Row and cols must be the same to compare!\n");
        for (i = 0; i < M.length; ++i)
            for (j = 0; j < M[i].length; ++j)
                if (M[i][j] != m1.M[i][j])
                    return false;
        return true;
    }


}

