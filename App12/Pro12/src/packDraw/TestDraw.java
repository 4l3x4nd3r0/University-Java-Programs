package packDraw;
import java.awt.BasicStroke;
import java.awt.Color;

public class TestDraw {
    public static void main(String[] args) {
        Draw1 d = new Draw1();
        d.setVisible(true);

        d.setWHSizePixels(700,700);
       
        d.setPenColor(new Color(255,0,255));
        d.addLine(0, 0, 100, 100);     
        
        d.setPenWidth(new BasicStroke(2));
        d.addCircle(220, 220, 100);
        d.setPenColor(new Color(0,0,0));
        d.addCircle(320, 520, 10);
        d.addLine(110, 110, 500, 400);   
        
        d.setPenColor(new Color(255,0,0));
        d.addCircleFilled(100, 320, 10);
        
    }
}
