import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GameFrame extends JFrame {

  GameBoard activeGameBoard;
  //Factories

  public GameFrame() {
    super("TestLayout");
    super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    init();
    }

  private void init() {
    this.getContentPane().setLayout(new GridBagLayout());

    //Setup some test panel with labels
    JPanel panel1 = new JPanel(new BorderLayout());
    panel1.setBorder(BorderFactory.createEtchedBorder());
    JLabel label1 =  new JLabel("Player 1");
    label1.setHorizontalAlignment(SwingConstants.CENTER);
    panel1.add(label1, BorderLayout.CENTER);

    JPanel panel2 = new JPanel(new BorderLayout());
    panel2.setBorder(BorderFactory.createEtchedBorder());
    JLabel label2 =  new JLabel("Player 2");
    label2.setHorizontalAlignment(SwingConstants.CENTER);
    panel2.add(label2, BorderLayout.CENTER);

    JPanel panel3 = new JPanel(new BorderLayout());
    panel3.setBorder(BorderFactory.createEtchedBorder());
    JLabel label3 =  new JLabel("Player 3");
    label3.setHorizontalAlignment(SwingConstants.CENTER);
    panel3.add(new DrawBoard(), BorderLayout.CENTER);

    JPanel panel4 = new JPanel(new BorderLayout());
    panel4.setBorder(BorderFactory.createEtchedBorder());
    JLabel label4 =  new JLabel("Factories");
    label4.setHorizontalAlignment(SwingConstants.CENTER);
    panel4.add(label4, BorderLayout.CENTER);

    JPanel gB = new JPanel((LayoutManager) activeGameBoard);

    JPanel panel5 = new JPanel(new BorderLayout());
    panel5.setBorder(BorderFactory.createEtchedBorder());
    panel5.add(new GameBoard(), BorderLayout.CENTER);

    JPanel factoriesAndActivePlayer = new JPanel(new GridLayout());
    panel5.setBorder(BorderFactory.createEtchedBorder());
    factoriesAndActivePlayer.add(panel4,  new GridBagConstraints(0, 0, 1, 1, 1.0, 0.3,
            GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(2, 2, 2, 2), 0, 0));
    factoriesAndActivePlayer.add(panel5,  new GridBagConstraints(0, 1, 1, 1, 1.0, 0.3,
            GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(2, 2, 2, 2), 0, 0));

    //Here goes the interesting code
    this.getContentPane().add(panel1,  new GridBagConstraints(0, 0, 2, 1, 1.0, 0.3,
            GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(2, 2, 2, 2), 0, 0));
    this.getContentPane().add(panel2,  new GridBagConstraints(2, 0, 2, 1, 1.0, 0.3,
            GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(2, 2, 2, 2), 0, 0));
    this.getContentPane().add(panel3,  new GridBagConstraints(4, 0, 2, 1, 1.0, 0.3,
            GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(2, 2, 2, 2), 0, 0));
    //next row
    this.getContentPane().add(factoriesAndActivePlayer,  new GridBagConstraints(0, 1, 6, 2, 1.0, 0.7,
            GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(2, 2, 2, 2), 0, 20));


    this.setPreferredSize(new Dimension(800, 600));
    this.pack();
}

  public static void main(String[] args) {
    GameFrame frame = new GameFrame();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}