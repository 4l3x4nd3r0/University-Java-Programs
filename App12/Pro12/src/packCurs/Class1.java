package packCurs;

public class Class1 {
    public static void main(String[] args) {
        int x = 1, y = 0, z;
        try {
            z = x / y;
        } catch (ArithmeticException e) {
            System.out.println(">>> Impartire cu zero! " + e);
        } finally {
            System.out.println("try - catch terminated");
        }
    }
}
