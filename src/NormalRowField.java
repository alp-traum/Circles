import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;


public class NormalRowField extends JPanel {
  public static final Color DARK_YELLOW = new Color(255,204,0);
  public static final Color LIGHT_YELLOW = new Color(255,255,153);


  public NormalRowField() {}

  @Override
  protected void paintComponent(Graphics graphics) {
    super.paintComponent(graphics);

    Graphics2D g2d = (Graphics2D) graphics;
    g2d.setColor(Color.ORANGE);
    g2d.fillRect(0, 0, getWidth(), getHeight());

    g2d.setColor(Color.YELLOW);
    g2d.setStroke(new BasicStroke(2));
    int h = (int) getSize().getHeight();
    int w = (int) getSize().getWidth();
    int columnCount = 0;
    int rowCount = 0;
    for (int columns = 0; columns < this.getSize().width; columns += w/5) {
      columnCount++;
      g2d.drawLine(columns, 0, columns, (h/5)*columnCount);

    }
    for (int rows = 0; rows < this.getSize().height; rows += h/5) {
      rowCount++;
      g2d.drawLine((w/5)*rowCount, rows, w, rows);
    }


  }

  /*
  Berkay idea, this code wont work because some methods doesnt exist, but i can create these methods:

    @Override
  protected void paintComponent(Graphics g) {
  int cellLength=30;
    super.paintComponent(g);

    for (int row = 0; row < 5; row++) {
      for (int col = 0; col < row; col++) {
      if(this.rows.get(row).get(col).isEmpty()){
      g.setColor(Color.Gray);
      }
      else{
      g.setColor(this.rows.get(row).get(col).getColor());
      }
        g.fillRect(col * cellLength, row * cellLength, cellLength - 1, cellLength - 1);
      }
    }


  }




   */
}
