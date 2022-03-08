public class DecToBinary {
    public static void main(String[] args) {
        String s = "";
	 // read in the command-line argument      
        int i, n = Integer.parseInt(args[0]);
        
        i = n;
        while (i > 0) {
            s = i % 2 + s; // % - modulo
            i = i / 2;     // / - integer division
        }
        System.out.println(n+" > "+s);
    }
}
