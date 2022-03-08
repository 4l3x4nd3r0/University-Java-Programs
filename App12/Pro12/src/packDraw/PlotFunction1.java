package packDraw;

import java.awt.BasicStroke;
import java.awt.Color;

public class PlotFunction1 {

    static double x(double t) {
        return t ;
    }

    static double y(double t) {
        return t * (Math.sin(t * 2) + Math.cos(2 * t));
    }

    static double z(double t) {
        return t * (Math.sin(t * 2) + Math.cos(3 * t));
    }

    public static void main(String[] args) {
        double t, ta, tb, h;
        int i, n;

        ta = -10.;
        tb = 100.;
        n = 1000;
        h = (tb - ta) / (n - 1.);

        Draw1 d = new Draw1();
        d.setWHSizePixels(500, 500);

        d.setPenColor(new Color(0, 0, 0));
        d.setPenWidth(new BasicStroke(0));
        for (i = 1; i <= n; ++i) {
            t = ta + (i - 1) * h;
            d.addPlotPoint(x(t),  y(t),new Color(0, 0, 0));
        }
        d.setBreakAt(n);
        
        d.setPenColor(new Color(0, 0, 244));
        //d.setPenWidth(new BasicStroke(3));
       
        for (i = 1; i <= n; ++i) {
            t = ta + (i - 1) * h;
            d.addPlotPoint(x(t), z(t),new Color(255, 0, 0));
        }
        
        d.setBreakAt(2*n);
        
        for (i = 1; i <= n; ++i) {
            t = ta + (i - 1) * h;
            d.addPlotPoint(y(t), z(t),new Color(28, 115, 28));
        }

        d.plot1();

    }
}
