package pckfun;

public class TestEnc {
    public static void main(String[] args) {
        int x = 4;
        Enc v = new Enc();
        
        v.setX(12);
        
        v.change(x);
        System.out.println(x);
        //System.out.println(v.getX());
    }
}
