import java.awt.*;
import java.awt.Color;

import javax.swing.*;
class abc extends JFrame{
    JLabel name;
    JButton btn1,btn2,btn3;
    JButton bt1,bt2,bt3;
    JTextField tname;
    JPanel toppanel; 
    public abc(){
        name = new JLabel("Enter Name");
        toppanel = new JPanel();
        toppanel.setLayout(new GridLayout(2,3));
        tname = new JTextField(20);
        btn1 = new JButton("East");
        btn2 = new JButton("West");
        btn3 = new JButton("Center");
        
        bt1 = new JButton("one");
        bt2 = new JButton("two");
        bt3 = new JButton("three");
        toppanel.add(bt1);
        toppanel.add(bt2);
        toppanel.add(bt3);
        add(toppanel,BorderLayout.NORTH);
        add(tname,BorderLayout.SOUTH);
        add(btn1,BorderLayout.EAST);
        add(btn2,BorderLayout.WEST);
        add(btn3,BorderLayout.CENTER);
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BorderLayout Demo");
        setLocationRelativeTo(null);
        btn3.setBackground(Color.MAGENTA);
    }
    public static void main(String[] args){
     abc a = new abc();  
    }
}