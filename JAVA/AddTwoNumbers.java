/* import javax.swing.*;
import java.awt.event.*;

public class AddTwoNumbers extends JFrame implements ActionListener {
    JTextField n1, n2;
   JLabel r;
   JButton ad;
    public AddTwoNumbers() {
        // Set up the frame
        setTitle("Add Two Numbers");
        setLayout(null);
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create and add the text fields for input
        n1 = new JTextField();
        n1.setBounds(10, 10, 280, 30);
        add(n1);

        n2 = new JTextField();
        n2.setBounds(10, 50, 280, 30);
        add(n2);

        // Create and add the button for adding the numbers
         ad = new JButton("Add");
        ad.setBounds(10, 90, 280, 30);
        ad.addActionListener(this);
        add(ad);

        // Create and add the label for displaying the result
        r = new JLabel();
        r.setBounds(10, 130, 280, 30);
        add(r);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the numbers from the text fields
        int num1 = Integer.parseInt(n1.getText());
        int num2 = Integer.parseInt(n2.getText());

        // Calculate and display the sum
        int sum = num1 + num2;
        r.setText("Sum: " + sum);
    }

    public static void main(String[] args) {
        new AddTwoNumbers();
    }
} */



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class buttons extends JFrame implements ActionListener{
    JButton [] btn;
    buttons(){
        btn = new JButton[6];
        btn[0] = new JButton("1");
        btn[1] = new JButton("2");
        btn[2] = new JButton("3");
        btn[3] = new JButton("4");
        btn[4] = new JButton("5");
        btn[5] = new JButton("6");
        //setLayout(new GridLayout(3,2));
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(btn[0],BorderLayout.NORTH);
        add(btn[1],BorderLayout.CENTER);
        add(btn[2]);
        add(btn[3]);
        add(btn[4]);
        add(btn[5]);
        for(int i=0;i<6;i++){
            btn[i].addActionListener(this);
        }
    }
    public static void main(String[] ullu){
        new buttons();
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == btn[0]){
            btn[0].setText("100");
        }
    }
}


