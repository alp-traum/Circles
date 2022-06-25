

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.Serial;

import javax.swing.JPanel;

/**
 *Describes the JPanel DrawBoard and makes the link to the playing field in the Model (Game).
 */
public class DrawBoard extends JPanel {

  @Serial
  private static final long serialVersionUID = 1L;



  /**
   * Sets the size of the Cells on the DrawBoard. Initialized with 10 pixels (SMALL).
   */
  private int gridSize = 10;

  public int getGridSize() {
    return gridSize;
  }

  public void setGridSize(int gridSize) {
    this.gridSize = gridSize;
  }

  /**
   * Constructor for a new DrawBoard that is connected to the model (Class Game).
   *
   *
   */
  public DrawBoard() {

  }

  /**
   * The core paint method for the DrawBoard Panel, on which can be clicked and dragged to set cells
   * alive or dead.
   *
   * @param g the <code>Graphics</code> object to protect
   */
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    Graphics2D g2D = (Graphics2D) g;

    // example code below
    g2D.setColor(Color.GRAY);
    g2D.fillRect(0, 0, getWidth(), getHeight());

    g2D.setColor(Color.LIGHT_GRAY);
    g2D.setStroke(new BasicStroke(1));
    int h = (int) getSize().getHeight();
    int w = (int) getSize().getWidth();
    for (int columns = 0; columns < this.getSize().width; columns += gridSize) {
      g2D.drawLine(columns, 0, columns, h);
    }
    for (int rows = 0; rows < this.getSize().height; rows += gridSize) {
      g2D.drawLine(0, rows, w, rows);
    }


  }
}
