import javax.swing.*;

public class OnlyJframeBtn{
    public static void main(String[] args) {
        JFrame f= new JFrame ("JFrameButton");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);
        JButton btn= new JButton("click");
        f.add(btn);
        f.setVisible(true);


    }
}