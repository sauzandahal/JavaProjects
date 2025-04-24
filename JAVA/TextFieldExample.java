import javax.swing.*;
import java.awt.event.*;

public class TextFieldExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("TextField Example");
        final JTextField tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 20);
        final JTextField tf2 = new JTextField();
        tf2.setBounds(50, 100, 150, 20);
        final JLabel label1 = new JLabel();
        label1.setBounds(50, 150, 250, 20);
        final JLabel label2 = new JLabel();
        label2.setBounds(50, 200, 250, 20);
        JButton b = new JButton("Show");
        b.setBounds(50, 250, 95, 30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s1 = tf1.getText();
                String s2 = tf2.getText();
                label1.setText(s1);
                label2.setText(s2);
            }
        });
       
        

        f.add(tf1);
        f.add(tf2);
        f.add(label1);
        f.add(label2);
        f.add(b);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
