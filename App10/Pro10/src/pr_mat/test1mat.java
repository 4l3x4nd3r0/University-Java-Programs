package pr_mat;
public class test1mat {
    public static void main(String[] args) {
        MatObj m1 = new MatObj(1, 3);
        MatObj m2 = new MatObj(1, 3);
        double[][] m3data = { { -1, 0}, { 3, -1 } };
        MatObj m3 = new MatObj(m3data);
        MatObj m3lan = new MatObj(m3data);
        
        double[][] m4data = { { 1 }, { 2 } };
        MatObj m4 = new MatObj(m4data);


        MatObj m1pm2;
        MatObj m3orim4;

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
