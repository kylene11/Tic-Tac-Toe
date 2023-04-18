import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class GameFrame extends JFrame implements ActionListener {

    TicTacToe ticTacToe;
    JButton resetButton;

    GameFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(100, 70);
        this.setLayout(null);

        resetButton = new JButton();
        resetButton.setText("Restart");
        resetButton.setSize(100, 50);
        resetButton.setLocation(0, 0);
        resetButton.addActionListener(this);

        ticTacToe = new TicTacToe();

        this.add(resetButton);
        this.add(ticTacToe);
        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            this.remove(ticTacToe);
            ticTacToe = new TicTacToe();
            this.add(ticTacToe);

        }
    }


    private void remove(TicTacToe game) {


    }

    private void add(TicTacToe ticTacToe) {

    }
}

