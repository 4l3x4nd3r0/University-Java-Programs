package packDesenFunctie;
public class Functie {
  double x(double t) {
    return t;
  }
  
  double y(double t) {
    //return  t*Math.cos(2.*t);
    return  t*Math.sin(t-1) - t+0.5;
    //return t*t*t-2*t*t-5*t-1;
  }
}
