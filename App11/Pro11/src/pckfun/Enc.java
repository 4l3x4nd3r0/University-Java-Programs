package pckfun;

public class Enc {
    private int x; // x > 11

    public void setX(int x) {
        if (x < 11)
            System.out.println(x + " *** Error: This value can't be under 11! ***");
        else {
            System.out.println(x+ " *** OK: New value is set. ***");
            this.x = x;
        }
    }
    
    public void change(int c) {
        c=c*2;
        System.out.println(c);
    }

    public int getX() {
        return x;
    }
}
