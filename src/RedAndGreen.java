import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class RedAndGreen extends JPanel {
  public RedAndGreen() {
    JPanel redAndGreen = new JPanel(new GridLayout(1,2));
    redAndGreen.add(new Red());
    redAndGreen.add(new Green());
  }

  public void drawComponent(Graphics g) {
    super.paintComponent(g);

    Graphics2D g2D = (Graphics2D) g;

  }
}
