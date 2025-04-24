// import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonExample extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3;
   
    JButton s;

    public RadioButtonExample() {
        r1 = new JRadioButton("Radio Button 1");
        r2 = new JRadioButton("Radio Button 2");
        r3 = new JRadioButton("Radio Button 3");

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);

        s = new JButton("Submit");
        s.addActionListener(this);

        JPanel panel = new JPanel();
        panel.add(r1);
        panel.add(r2);
        panel.add(r3);
        panel.add(s);

        add(panel);
        setTitle("Radio Button Example");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (r1.isSelected()) {
            JOptionPane.showMessageDialog(this, "r1 is selected.");
        } else if (r2.isSelected()) {
            JOptionPane.showMessageDialog(this, "r2 is selected.");
        } else if (r3.isSelected()) {
            JOptionPane.showMessageDialog(this, "r3 is selected.");
        }
    }

    public static void main(String[] args) {
        new RadioButtonExample();
    }
}
