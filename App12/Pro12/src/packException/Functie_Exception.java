package packException;
import java.util.*;
public class Functie_Exception {
    public double F(double x) throws ArithmeticException{
        if (x < 1.) {
            if (x == -2.)
                throw new ArithmeticException("Impartire cu 0");
            return x/(x+2);
        }
        else if (x <= 5.) {
            if (x > 4.5)
                throw new ArithmeticException("Argument radical negativ.");
            return Math.sqrt(4.5-x);
        }
        else 
            return Math.sin(x)/x;
    }
    
    public double citeste_real() throws InputMismatchException
    {
        Scanner in =  null;
        int contorErr = 0; //contor erori, pt. 3 aplicatia se opreste.
        double x;
        
        while(true) {
            in = new Scanner(System.in);
            try {
                x = in.nextDouble();
                break;  //daca nu sunt erori se iese din ciclu
            }
            catch (InputMismatchException e) {
                ++contorErr;
                System.out.printf("Eroare(%d) la citire, introduce o valoarea reala.\n", contorErr);                  
                if ( contorErr == 3 ) 
                    throw new InputMismatchException("*** Prea prost ca sa bage 1 numar real. ***");
            }
        }
        return x;
    }
}
