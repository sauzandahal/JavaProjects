import javax.swing.*;
import java.awt.*;
public class Jlblbtn {
    public static void main(String[] args) {
        JFrame f= new JFrame("lbl&btn");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);
        JLabel lbl=new JLabel("Name");
        f.add(lbl);
        JButton btn= new JButton("Submit");
        f.add(btn);
       
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
}
