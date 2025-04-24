import javax.swing.*;  
import java.awt.event.*;  
public class ListExample2
{  
     ListExample2(){  
        JFrame f= new JFrame();  
        final JLabel label = new JLabel();          
        label.setSize(500,100);  
        JButton b=new JButton("Show");  
        b.setBounds(200,150,80,30);  
        final DefaultListModel l1 = new DefaultListModel<>();  
          l1.addElement("Honda");  
          l1.addElement("Yamaha");  
          l1.addElement("Suzuki");  
          l1.addElement("Ducati");  
          final JList list1 = new JList<>(l1);  
          list1.setBounds(100,100, 75,75);  
          DefaultListModel l2 = new DefaultListModel<>();  
          l2.addElement("150cc");  
          l2.addElement("250cc");  
          l2.addElement("699cc");  
          l2.addElement("900cc");  
          final JList list2 = new JList<>(l2);  
          list2.setBounds(100,200, 75,75);  
          f.add(list1); f.add(list2); f.add(b); f.add(label);  
          f.setSize(450,450);  
		  f.setTitle("JList - demo ");
          f.setLayout(null);  
		  f.setLocationRelativeTo(null);
          f.setVisible(true);  
		  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          b.addActionListener(new ActionListener() {  
              public void actionPerformed(ActionEvent e) {   
                 String data = "";  
                 if (list1.getSelectedIndex() != -1) {                       
                    data = "Motorbike Brand Selected: " + list1.getSelectedValue();   
                    label.setText(data);  
                 }  
                 if(list2.getSelectedIndex() != -1){  
                    data += ", Engine Capacity Selected: "+list2.getSelectedValue();   ;  
                    label.setText(data);    
                 }   
              }  
           });   
     }  
public static void main(String args[])  
    {  
   new ListExample2();  
    }
}
