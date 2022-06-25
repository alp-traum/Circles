import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MiddleFactoryGUI extends JPanel {
    private final int cellSize = 30;
public MiddleFactoryGUI(){
    super();
}

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.BLACK);
        for (int i=0; i<9; i++){
            g2D.drawRect(i*cellSize, 0, i*cellSize,3*cellSize);
        }
        for (int j=0; j<3; j++){
            g2D.drawRect(0,j*cellSize,9*cellSize,j*cellSize);
        }
        repaint();
    }

}
