package packDesenFunctie;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JFrame;
public class frDesen extends JFrame {
    private Desenare jPanel1 = new Desenare();
    private Functie fdes;
    private Punct p[];

    public frDesen() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout(null);
        this.setSize(new Dimension(400, 300));
        this.setTitle("Functie & solutie");
        jPanel1.setBounds(new Rectangle(5, 5, 370, 255));
        jPanel1.setBackground(Color.white);
        jPanel1.setOpaque(true);
        jPanel1.setLayout(null);
        this.getContentPane().add(jPanel1, null);

        double t, pas, tmin, tmax;
        int n;
        tmin = -3;
        tmax = 4;
        n = 300;
        pas = (tmax - tmin) / n;

        //functia care se deseneaza
        fdes = new Functie();
        p = new Punct[n];
        
        for (int i = 0; i < p.length; ++i) {
            t = tmin + i * pas;
            p[i] = new Punct(fdes.x(t), fdes.y(t));
        }
        jPanel1.setPuncte(p);
        //jPanel1.repaint();

        //cauta solutii
        for (int i = 0; i < p.length - 1; ++i) {
            if (Math.signum(p[i].getY()) * Math.signum(p[i + 1].getY()) < 0) {
                Bisect b = new Bisect(p[i].getX(), p[i + 1].getX(), fdes);
                b.solve();
                //System.out.println("Iteration number: " + b.k);
                System.out.println("Root obtained: " + b.x);
                //System.out.println("Estimated error: " + b.dx);
                jPanel1.addsol(b.x);
            }
        }
    }

    public static void main(String[] args) {
        frDesen fd = new frDesen();
        fd.setVisible(true);
        
    }
}

