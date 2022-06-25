import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorFrame extends JFrame {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setLayout(new GridLayout());
    JPanel p = new JPanel(new GridLayout(2, 1));
    p.add(new Green());
    p.add(new Red());
    RedAndGreen redAndGreen = new RedAndGreen();

    frame.setSize(500, 500);
    frame.setVisible(true);
  }
}
