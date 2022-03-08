package packCurs;

import javax.swing.JFrame;
public class SimpleFrame {
 public static void main(String[] args) {
  JFrame frame = new JFrame();
        
  frame.setSize(800, 400);
  frame.setTitle("Empty Frame ...");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  frame.setVisible(true);
 }
}
