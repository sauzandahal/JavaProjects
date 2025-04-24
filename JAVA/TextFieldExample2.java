/* create a swing GUI  that contains a text field and two buttons (ok  and clear ) 
when ok button  is clicked "welcome" message should be displayed in the text field
 and clear button should clear the text field content */



/* import javax.swing.*;
import java.awt.event.*;

public class TextFieldExample2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Field Example");
        final JTextField textField = new JTextField();
        textField.setBounds(50, 50, 150, 20);
        JButton okButton = new JButton("OK");
        okButton.setBounds(50, 100, 95, 30);
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("Welcome");
            }
        });
        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(150, 100, 95, 30);
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
        frame.add(textField);
        frame.add(okButton);
        frame.add(clearButton);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
 */

 import javax.swing.*;
import java.awt.event.*;

public class TextFieldExample2 extends JFrame implements ActionListener {
    JTextField textField;

    public TextFieldExample2() {
        JFrame frame = new JFrame("Text Field Example");
        textField = new JTextField();
        textField.setBounds(50, 50, 150, 20);
        JButton okButton = new JButton("OK");
        okButton.setBounds(50, 100, 95, 30);
        okButton.addActionListener(this);
        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(150, 100, 95, 30);
        clearButton.addActionListener(this);
        frame.add(textField);
        frame.add(okButton);
        frame.add(clearButton);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals("OK")) {
            textField.setText("Welcome");
        } else if (e.getActionCommand().equals("Clear")) {
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        new TextFieldExample2();
    }
}
