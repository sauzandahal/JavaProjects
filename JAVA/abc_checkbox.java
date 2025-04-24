
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class abc_checkbox extends JFrame implements ItemListener,ActionListener{
    JCheckBox jcb1 = new JCheckBox("one");
    JCheckBox jcb2 = new JCheckBox("two");
    JCheckBox jcb3 = new JCheckBox("three");
    JCheckBox jcb4 = new JCheckBox("Four");
    JLabel result;
    JButton btn; 
    public abc_checkbox(){
        setLayout(new FlowLayout());
        result = new JLabel("");
        btn = new JButton("How You are supposed to live without me!!!");
        add(jcb1);
        add(jcb2);
        add(jcb3);
        add(jcb4);
        add(btn);
        add(result);
        btn.addActionListener(this);
        jcb1.addItemListener(this);
        jcb2.addItemListener(this);
        jcb3.addItemListener(this);
        jcb4.addItemListener(this);
    }
    public void actionPerformed(ActionEvent ea){
        btn.setBackground(Color.gray);
        btn.setForeground(Color.RED);
        if(jcb1.isSelected()){
            btn.setBackground(Color.yellow);
        }
        if(jcb1.isSelected()){
            result.setText(""+jcb1.getText());
        }else if(jcb2.isSelected()){
            result.setText(""+jcb2.getText());
        }else if(jcb3.isSelected()){
            result.setText(""+jcb3.getText());
        }
    }
    public void itemStateChanged(ItemEvent ie){
        if(jcb1.isSelected()){
            result.setText(""+jcb1.getText());
        }else if(jcb2.isSelected()){
            result.setText(""+jcb2.getText());
        }else if(jcb3.isSelected()){
            result.setText(""+jcb3.getText());
        }else if(jcb4.isSelected()){
           result.setText(""+jcb4.getText());
        }
    }
    public static void main(String[] arg){
        abc_checkbox b = new abc_checkbox();
        b.setSize(700,300);
        b.setVisible(true);
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.setLocationRelativeTo(null);
    }  
} 