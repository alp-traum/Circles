import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



public class GameBoard extends JPanel {
  public GameBoard() {

  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    JPanel board = new JPanel(new BorderLayout());
    board.add(new NormalRowField(), BorderLayout.CENTER);
    board.add(new MiddleFactoryGUI(), BorderLayout.WEST);

  }

}
