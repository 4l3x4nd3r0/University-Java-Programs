
package pack2DPrimitives;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Antal Tiberiu
 */
public class P extends javax.swing.JPanel {

    /** Creates new form P */
    public P() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }//GEN-END:initComponents

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        double leftX = 50;
        double topY = 50;
        double width = 200;
        double height = 150;

        //trasare dreptunghi
        Rectangle2D dreptunghi = new Rectangle2D.Double(leftX, topY, width, height);
        g2.draw(dreptunghi);

        //schimbare culoare
        //trasare elipsa
        g2.setPaint(Color.RED);
        Ellipse2D elipsa = new Ellipse2D.Double();
        elipsa.setFrame(dreptunghi);
        //umplere elipsa
        g2.fill(elipsa);
        ////g2.draw(elipsa);

        //desenare cerc
        double centruX = dreptunghi.getCenterX();
        double centruY = dreptunghi.getCenterY();
        double raza = 120;
        Ellipse2D cerc = new Ellipse2D.Double();
        cerc.setFrameFromCenter(centruX, centruY, centruX + raza, centruY + raza);
        g2.draw(cerc);

        //desenare linie
        g2.setStroke(new BasicStroke(widthPen));
        g2.draw(new Line2D.Double(leftX, topY, leftX + width, topY + height));

        g2.setPaint(Color.BLUE);
        //desenare text
        g2.drawString("Salutare! ", (int) leftX, (int) topY - 2);
        
        if (showCar) masinaShape(g2);

    }

    void masina(Graphics2D g2) {
        Rectangle2D r;
        g2.draw(r = new Rectangle2D.Double(100, 170, 200, 30));
        g2.fill(r);
        g2.draw(r = new Rectangle2D.Double(150, 100, 150, 100));
        g2.fill(r);
        g2.setPaint(Color.ORANGE);
        g2.draw(r = new Rectangle2D.Double(170, 110, 40, 55));
        g2.fill(r);

        g2.setPaint(Color.BLACK);
        Ellipse2D c;
        g2.draw(c = new Ellipse2D.Double(160, 180, 40, 40));
        g2.fill(c);
        g2.draw(c = new Ellipse2D.Double(240, 170, 40, 40));
        g2.fill(c);

        g2.setPaint(Color.WHITE);
        g2.draw(c = new Ellipse2D.Double(165, 185, 30, 30));
        g2.fill(c);
    }

    void masinaShape(Graphics2D g2) {
        Shape s[] = new Shape[7];
        s[0] = new Rectangle2D.Double(100, 170, 200, 30);
        s[1] = new Rectangle2D.Double(150, 100, 150, 100);
        s[2] = new Rectangle2D.Double(170, 110, 40, 55);
        s[3] = new Ellipse2D.Double(160, 180, 40, 40);
        s[4] = new Ellipse2D.Double(240, 180, 40, 40);
        s[5] = new Ellipse2D.Double(165, 185, 30, 30);
        s[6] = new Ellipse2D.Double(245, 185, 30, 30);

        for (int i = 0; i < s.length; ++i) {
            g2.setPaint(c);
            switch (i) {
            case 2:
                g2.setPaint(Color.ORANGE);
                break;
            case 5:
            case 6:
                g2.setPaint(Color.WHITE);
                break;
            }
            g2.fill(s[i]);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    public void setWidth(float width) {
        this.widthPen = width;
    }

    public void setShowCar(boolean showCar) {
        this.showCar = showCar;
    }

    public void setC(Color c) {
        this.c = c;
    }
    private boolean showCar = true;
    private float widthPen = 1.f;
    private Color c = Color.BLACK; 
    
}