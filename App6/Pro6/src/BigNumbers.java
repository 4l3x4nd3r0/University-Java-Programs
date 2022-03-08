import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {
        int N = 7;
        BigInteger p = BigInteger.valueOf(N);
        for (int i = 2; i <=13901; i++) 
            p=p.multiply(BigInteger.valueOf(N));
        System.out.println(p);
    }
}
