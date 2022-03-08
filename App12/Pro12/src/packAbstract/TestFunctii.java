package packAbstract;

public class TestFunctii {
    public static void main(String[] args) {
        Functie1 f1 = new Functie1(-3., 3., 30);
        Functie2 f2 = new Functie2(-7., 7., 45);
        Functie11 f3 = new Functie11(-5., 5., 25);
        BaD bw = new BaD(0., 6.28, 25);
        Functie3 fx = new Functie3(-7., 7., 45);
       
        FunctieA fA[] = new FunctieA[700];
        fA[0] = f1;
        fA[1] = f2;
        fA[2] = f3;
        fA[3] = bw;
        fA[4] = bw;
        fA[5] = fx;
       
        for (FunctieA f : fA)
            if (f == null)
                continue;
            else
                f.afisare();
    }
}
