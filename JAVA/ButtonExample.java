import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JButton buttonA = new JButton("a");
        JButton buttonB = new JButton("b");

        buttonA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonB.setText("sheetal");
            }
        });

        buttonB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonA.setText("bijay");
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(buttonA);
        frame.add(buttonB);

        frame.setVisible(true);
    }
}
