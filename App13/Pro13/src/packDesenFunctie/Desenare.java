package packDesenFunctie;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JPanel;

public class Desenare extends JPanel {
    //atribute publice
    //variabile de instanta
    public Color culoareScris;

    Punct p[];
    Functie f;
    int csol, nrsolmax = 40;
    Punct sol[] = new Punct[nrsolmax];
    double xmin, xmax;
    double ymin, ymax;

    //constructori ...
    public Desenare() {
        culoareScris = Color.BLACK;
    }

    public void addsol(double x) {
        sol[csol] = new Punct(x, 0.);
        if (csol < nrsolmax)
            ++csol;
    }

    public void setPuncte(Punct[] puncte) {
        p = puncte;
        //System.out.println("L = "+p.length);
        MinMax();
    }

    void MinMax() {
        xmin = xmax = p[0].getX();
        ymin = ymax = p[0].getY();
        for (int i = 1; i < p.length; ++i) {
            if (p[i].getX() < xmin)
                xmin = p[i].getX();
            if (p[i].getY() < ymin)
                ymin = p[i].getY();
            if (p[i].getX() > xmax)
                xmax = p[i].getX();
            if (p[i].getY() > ymax)
                ymax = p[i].getY();
        }
    }

    int toScale(double x, double min, double max, double L) {
        return (int) ((x - min) / (max - min) * L);
    }

    public void resetsolcount() {
        csol = 0;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        //variabile locale
        //latimea JPanel-ului
        double LX = this.getWidth();
        //inaltimea JPanel-ului
        double LY = this.getHeight();
        //Originea in sistemul de axe al graficului
        double x0 = 0.5;
        double y0 = LY - 0.5;
        double x1, y1, x2, y2;

        g2.setPaint(culoareScris);
        try {
            //0 e cuprins intre x minim si x maxim
            //avem de trasat axa OY
            if (xmin * xmax < 0) {
                g2.setPaint(Color.RED);
                int ox0 = (int) (x0 + toScale(0, xmin, xmax, LX));
                g2.draw(new Line2D.Double(ox0, 0, ox0, LY));
                g2.setPaint(culoareScris);
            }

            if (ymin * ymax < 0) {
                //0 e cuprins intre y minim si y maxim
                //avem de trasat axa OX
                g2.setPaint(Color.RED);
                int oy0 = (int) (y0 - toScale(0, ymin, ymax, LY));
                g2.draw(new Line2D.Double(0, oy0, LX, oy0));
                g2.setPaint(culoareScris);
            }

            //
            x1 = x0 + toScale(p[0].getX(), xmin, xmax, LX);
            y1 = y0 - toScale(p[0].getY(), ymin, ymax, LY);

            for (int i = 1; i < p.length; ++i) {
                x2 = x0 + toScale(p[i].getX(), xmin, xmax, LX);
                y2 = y0 - toScale(p[i].getY(), ymin, ymax, LY);
                //System.out.println(i);
                //trasare lini intre 2 puncte consecutive
                g2.draw(new Line2D.Double(x1, y1, x2, y2));
                x1 = x2;
                y1 = y2;

                //desenare text
                //g2.drawString("Functia ...  ", (int)x0, (int)y0);
            }
            //trasare solutii
            for (int j = 0; j < sol.length; ++j) {
                double xc, yc;
                if (sol[j] == null)
                    continue;
                xc = x0 + toScale(sol[j].getX(), xmin, xmax, LX);
                yc = y0 - toScale(sol[j].getY(), ymin, ymax, LY);
                //trasare cerc - mijlocul marcheaza solutia lui f(x) = 0
                g2.draw(new Ellipse2D.Double(xc - 5, yc - 5, 10, 10));
            }
        } catch (Exception e) {
            System.out.println("Exceptie =" + e);
        }
    }
}
