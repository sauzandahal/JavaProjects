/* /* import java.awt.*;

import javax.swing.*;
class abcFlow extends JFrame{
    JLabel name;
    JButton btn1,btn2,btn3;
    JTextField tname;
    public abcFlow(){
        
        name = new JLabel("Enter Name");
        tname = new JTextField(20);
        btn1 = new JButton("East");
        btn2 = new JButton("West");
        btn3 = new JButton("Center");
        //Layout manager: specifies how the components are arranged on the container
        //by default layout of JFrame is BorderLayout
        //BorderLayout divides container into five parts: east,west,south,north,center
        add(name);
        add(tname);
        add(btn1);
        add(btn2);
        add(btn3);
        setLayout(new FlowLayout());//changing default layout to Flowlayout
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args){
     abcFlow a = new abcFlow();  
    }
}
     */
/* 
    import java.awt.*;  
import javax.swing.*;  
  
public class FlowLayout {  
    JFrame frame;  
    FlowLayout(){  
        frame = new JFrame();  
      
        JButton button1 = new JButton("Button 1");  
        JButton button2 = new JButton("Button 2");  
        JButton button3 = new JButton("Button 3");  
          
        frame.add(button1);  
        frame.add(button2);  
        frame.add(button3);
        
        frame.setLayout((LayoutManager) new FlowLayout());  
        frame.setSize(300, 200);  
        frame.setVisible(true);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }  
    public static void main(String[] args) {  
        new FlowLayout();  
    }  
} */  


import java.awt.*;  
import javax.swing.*;  
  
public class FlowLayout {  
    JFrame frame;  
    FlowLayout(){  
        frame = new JFrame();  
      
        JButton button1 = new JButton("Button 1");  
        JButton button2 = new JButton("Button 2");  
        JButton button3 = new JButton("Button 3");  
          
        frame.add(button1);  
        frame.add(button2);  
        frame.add(button3);
        
        frame.setLayout(new FlowLayout());  
        frame.setSize(300, 200);  
        frame.setVisible(true);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }  
    public static void main(String[] args) {  
        new FlowLayout();  
    }  
}
