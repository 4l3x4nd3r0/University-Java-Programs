package pr_mat;
public class test1mat {
    public static void main(String[] args) {
        mat1 m1 = new mat1(1, 3);
        mat1 m2 = new mat1(1, 3);
        double[][] m3data = { { -1, 0}, { 3, -1 } };
        mat1 m3 = new mat1(m3data);
        mat1 m3lan = new mat1(m3data);
        
        double[][] m4data = { { 1 }, { 2 } };
        mat1 m4 = new mat1(m4data);


        mat1 m1pm2;
        mat1 m3orim4;

        System.out.println("\nReading A...\n");
        m1.matR();
        System.out.println("\nReading B...\n");
        m2.matR();

        System.out.println("\nA...\n");
        m1.matW();

        System.out.println("\nB...\n");
        m2.matW();

        //m1pm2=m1.addM(m3);
        m1pm2 = m1.addM(m2);
        System.out.println("\nA+B...\n");
        m1pm2.matW();

        m1pm2 = m1.subM(m2);
        System.out.println("\nA-B...\n");
        m1pm2.matW();

        System.out.println("\nA = B? ..." + m1.eqM(m2) + "\n");

        System.out.println("\nA = ");
        m3.matW();
        System.out.println("B = ");
        m4.matW();
        m3orim4 = m3.proM(m4);
        System.out.println("\nA*B...\n");
        m3orim4.matW();
        
        for(int i=1; i<=10;++i) {
            System.out.println("\n\n"+i);
            m3lan=m3lan.proM(m3);
            m3lan.matW();  
        }

        /*
        m3orim4 = m4.proM(m3);
        System.out.println("\nA*B...\n");
        m3orim4.matW();
        */
    }
}
