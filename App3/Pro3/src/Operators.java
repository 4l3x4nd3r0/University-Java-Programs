public class Operators {
    public static void main(String args[]) {
        int a, b, c, d, e, f, g;
        double da, db, dc, dd, de;
        boolean ba, bb, bc, bd;

        System.out.println("Aritmetica cu int");
        a = 1 + 1; //adunare
        b = a * 3; //inmultire
        c = b / 4; //impartire
        d = c - a; //scadere
        e = -d; //- unar
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        System.out.println("\nAritmetica cu double");
        da = 1. + 1.;
        db = da * 3.;
        dc = db / 4.;
        dd = dc - da;
        de = -dd;
        System.out.println("da = " + da);
        System.out.println("db = " + db);
        System.out.println("dc = " + dc);
        System.out.println("dd = " + dd);
        System.out.println("de = " + de);

        System.out.println("\nAritmetica modulo");
        a = 42;
        da = 42.65;
        System.out.println(a + "%10  = " + a % 10);
        System.out.println(da + "%10 = " + da % 10);

        System.out.println("\nConversii");
        //fortarea conversiei de la double la int
        System.out.println("(int)" + da + " = " + (int) da);

        System.out.println("\nOperatori logici");
        ba = false;
        bb = true;
        bc = da > db; //? 42.5 > 6 = true
        bd = ba && bc || bc; // o expresie logica
        System.out.println(ba + " && " + bb + " || " + bc + " = " + bd);
        /* bd = ba & 1/(e+d) < 3; //NU se face scurtcircuitare pt operandul 2
 * aplicatia va crapa */

        bd = ba && 1 / (e + d) < 3; //se face scurtcircuitare pt operandul 2
        System.out.println(ba + " && 1/(" + e + d + ") < 3 = " + bd);

        System.out.println("\nOperatori pe biti");
        a = 3; // 0011 in binar
        b = 6; // 0110 in binar
        c = a | b;
        d = a & b;
        e = a ^ b;
        f = (~a & b) | (a & ~b); //epresie cu operatori pe biti
        g = ~a & 0x0f;
        System.out.println("a = " + Integer.toBinaryString(a)); //11
        System.out.println("b = " + Integer.toBinaryString(b)); //110
        System.out.println("c = " + Integer.toBinaryString(c)); //111
        System.out.println("d = " + Integer.toBinaryString(d)); //10
        System.out.println("e = " + Integer.toBinaryString(e)); //101
        System.out.println("f = " + Integer.toBinaryString(f)); //101
        System.out.println("g = " + Integer.toBinaryString(g)); //1100
        System.out.println(Integer.toBinaryString(a) + " << 2 =" + Integer.toBinaryString(a << 2));

        System.out.println("\nFunctii matematice si constante");
        System.out.println("sqrt(" + a + ") = " + Math.sqrt(a)); //radical de ordinul 2
        System.out.println("sin(" + a + ") = " + Math.sin(a)); //sinus
        System.out.println("cos(" + a + ") = " + Math.cos(a)); //cosinus
        System.out.println("tan(" + a + ") = " + Math.tan(a)); //tangenta
        System.out.println("atan(" + a + ") = " + Math.atan(a)); //arctangenta
        System.out.println("exp(" + a + ") = " + Math.exp(a)); //e la puterea a
        System.out.println("log(" + a + ") = " + Math.log(a)); //log natural
        System.out.println("pow(" + a + ",3) = " + Math.pow(a, 3)); //a la puterea 3
        System.out.println("PI = " + Math.PI); //PI
        System.out.println("E = " + Math.E); //E
    }
}
