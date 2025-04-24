//write a program in swing to display  a button with caption "Hide Me"
//and if you click the button then ut wil dissapper.


import javax.swing.*;
import java.awt.event.*;

public class BtnDisappear extends JFrame{
    public static void main(String[] args) {
        JFrame f = new JFrame("Hide Me Button");
        JButton b = new JButton("Hide Me");

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b.setVisible(false);
            }
        });

        f.getContentPane().add(b);
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}






// import javax.swing.*;
// import java.awt.event.*;

// public class BtnDisappear{
//     public static void main(String[] args) {
//     JFrame f = new JFrame("click  to make the button disapear");
//     JButton b = new JButton("Hide me ");

//     b.addActionListener(new ActionListener() {
//         public void actionPerformed(ActionEvent e){
//             b.setVisible(false);
//         }
//     });


//     f.getContentPane().add(b);
//     f.setSize(200,200);
//     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     f.setVisible(true);


//     }
// }






// TO DRAW DASHED LINE








// import javax.swing.*;
// import java.awt.*;
// public class BtnDisappear extends JPanel {
//     public void paint (Graphics g){
//         Graphics2D g2d =(Graphics2D) g;
//         g2d.setStroke(new BasicStroke(3,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL,0,new float[]{9},0));
//         g2d.drawLine(20, 40, 200, 40);
        
//     }
//     public static void main(String[] args) {
//         JFrame f =new JFrame();
//         f.add(new BtnDisappear());
//         f.setSize(250,200);
//         f.setVisible(true);
        
//     }
    
// }