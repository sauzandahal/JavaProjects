/* import javax.swing.*;
// import java.awt.*;

public class FourButton {
    JButton j1,j2,j3,j4;
    JFrame f;

    public FourButton(){
        f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);

        j1= new JButton("B1");
        j1.setBounds(15,20,50,90);
        j2= new JButton("b2");
        j2.setBounds(45,20,50,90);
        j3= new JButton("b3");
        j3.setBounds(15,40,50,90);
        j4= new JButton("b4");
        j4.setBounds(30,40,50,90);

    //   f.setlayout(null);
        f.add(j1);
        f.add(j2);
        f.add(j3);
        f.add(j4);
        f.setVisible(true);
    }
} */

import javax.swing.*;

public class FourButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(null);

        // Create buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");

        // Set position and size of buttons using setBounds
        button1.setBounds(10, 10, 100, 50);
        button2.setBounds(10, 70, 100, 50);
        button3.setBounds(120, 10, 100, 50);
        button4.setBounds(120, 70, 100, 50);

        // Add buttons to frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);

        frame.setVisible(true);
    }
}
