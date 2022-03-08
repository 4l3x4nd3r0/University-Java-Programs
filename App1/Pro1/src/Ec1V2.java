import javax.swing.JOptionPane;

public class Ec1V2 {
    public static void main(String[] args) {
        double a, b, x;
        String in;

        in = JOptionPane.showInputDialog("a: ");
        a = Double.parseDouble(in);
        in = JOptionPane.showInputDialog("b: ");
        b = Double.parseDouble(in);

        x = -b / a;

        JOptionPane.showMessageDialog(null, x, "Solutia ecuatiei " + a + "x+" + b + "=0",
                                      JOptionPane.INFORMATION_MESSAGE);
    }
}

