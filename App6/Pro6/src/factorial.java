import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        
        System.out.print("n: ");
        int n = in.nextInt();
        
        long fact = 1;
        for(int i = 1; i<=n ; ++i)
            fact=fact*i; //sau fact*=i;
        
        System.out.println(n+"! = "+fact);
    }
}
