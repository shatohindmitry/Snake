//

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Main extends JFrame {

    public Main() {

        initScreen();
    }

    private void initScreen() {

        add(new ScreenPanel());

        setResizable(false);
        pack();

        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[]args){
        EventQueue.invokeLater(() -> {
            JFrame frame = new Main();
            frame.setVisible(true);
        });
    }
}
