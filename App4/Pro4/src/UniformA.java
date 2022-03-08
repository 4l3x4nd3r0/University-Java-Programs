import java.util.Scanner;
public class UniformA {
    public static void main(String[] args) {
        double x0,v0,a,t,x,v;
        Scanner in = new Scanner(System.in);
        
        System.out.print("x0: ");
        x0 = in.nextDouble();
        //x0=1.;

        System.out.print("v0: ");
        v0 = in.nextDouble();
        //v0=1.;
        
        System.out.print("a: ");
        a = in.nextDouble();
        //a=1.77;
        
        System.out.print("t: ");
        t = in.nextDouble();
        
        x=x0+v0*t+0.5*a*t*t;
        v=v0+a*t;
            
        System.out.println("x="+x+"\nv="+v);       
        
        System.out.println("00123456789");
        System.out.printf("t=%8.2f, x=%-8.3f, v=%-10.4f\n",t,x,v); 
        
    }
}

