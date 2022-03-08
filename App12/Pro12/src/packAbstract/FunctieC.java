package packAbstract;


public  class FunctieC {
    double a, b, h, x;
    int i, n;
    final int LY = 150;

    double[] xf;
    double[] yf;
    double[] dyf;

    public FunctieC(double a, double b, int n) {
        this.a = a;
        this.b = b;
        this.n = n;
        h = (b - a) / (n - 1);

        xf = new double[n];
        yf = new double[n];
        dyf = new double[n];

        calcul();
    }

    public  double functie(double x) {
        return Math.cos(Math.sin(x))*x;
    }

    double functied1(double x) {
        final double h = 0.001;
        return (functie(x + h) - functie(x)) / h;
    }

    double min(double[] a) {
        double m = a[0];
        for (int i = 1; i < a.length; ++i)
            if (a[i] < m)
                m = a[i];
        return m;
    }

    double max(double[] a) {
        double m = a[0];
        for (int i = 1; i < a.length; ++i)
            if (a[i] > m)
                m = a[i];
        return m;
    }

    String functip(int p, char c, String in) {
        String aux = "";

        for (int i = 0; i < in.length(); ++i)
            if (i == p)
                aux += c;
            else
                aux += in.charAt(i);
        return aux;
    }

    double scale(double v, double vmin, double vmax) {
        return (v - vmin) / (vmax - vmin);
    }

    void calcul() {
        double aux;
        int j = 1;

        for (i = 1; i <= n; ++i) {
            x = a + (i - 1) * h;
            xf[j - 1] = x;
            aux = functie(x);
            if (Double.isInfinite(aux) || Double.isNaN(aux)) {
                --n;
                continue;
            }
            yf[j - 1] = aux;
            dyf[j - 1] = functied1(x);
            ++j;
        }
    }

    void afisare() {
        boolean isoy = true;
        String tip;
        double minyf = min(yf);
        double maxyf = max(yf);
        double mindyf = min(dyf);
        double maxdyf = max(dyf);

        //minimul dintre cele 2 minime si
        //maximul dintre cele 2 maxime
        double ma = (maxyf > maxdyf) ? maxyf : maxdyf;
        double mi = (minyf < mindyf) ? minyf : mindyf;

        System.out.println("----------------------------------------------");
        System.out.println("|  i  |      x     |    f(x)    |    fd1(x)  |");
        System.out.println("----------------------------------------------");

        for (i = 0; i < n; ++i) {
            int pos = (int) (scale(yf[i], mi, ma) * (LY - 1));
            int pos0 = (int) (scale(0., mi, ma) * (LY - 1));
            int posd = (int) (scale(dyf[i], mi, ma) * (LY - 1));

            String tipinit = "";
            if ((Math.abs(xf[i]) < 0.18) && isoy) {
                for (int i = 1; i <= LY; ++i)
                    tipinit += "-";
                isoy = false;
            } else
                for (int i = 1; i <= LY; ++i)
                    tipinit += " ";


            //trasare axa Ox
            if (ma * mi < 0.)
                tip = functip(pos0, '|', tipinit);
            else
                tip = tipinit;
            //F pt. functie
            //D pt. derivata
            tip = functip(pos, 'F', tip);
            tip = functip(posd, 'D', tip);

            System.out.printf("| %3d | %-+10.6f | %10.6f | %10.6f | %s\n", i, xf[i], yf[i], dyf[i], tip);
        }
        System.out.println("----------------------------------------------");
    }
    
    public static void main(String[] args) {
        Functie1 f1 = new Functie1(-3., 3., 71);
        f1.afisare();
    }
}
