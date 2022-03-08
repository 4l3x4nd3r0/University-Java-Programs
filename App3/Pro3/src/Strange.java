public class Strange {
    public static void main(String[] args) {
        int a = 32, b = 10, c;
        double xa = 32., xb = 0., xc;
        byte b1 = 127, b2 = 127, b3;

        c = a / b; // divide int by an int > int
        System.out.println("c = " + c + " r " + a%b);
        
        xc = xa / xb; // divide int by an int > int
        System.out.println("xc = " + xc);
        
        c = b1 + b2;
        System.out.println("xb = " + c);// b3-256
      

        System.out.println("The end ...");
    }
}
