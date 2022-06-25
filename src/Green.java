import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Green extends JPanel {
  public Green() {}

  @Override
  protected void paintComponent(Graphics graphics) {
    super.paintComponent(graphics);

    Graphics2D g2d = (Graphics2D) graphics;
    g2d.setColor(Color.GREEN);
    g2d.fillRect(0, 0, getWidth(), getHeight());
  }
}
