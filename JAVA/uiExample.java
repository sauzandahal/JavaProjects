import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  
public class uiExample implements ActionListener{    
JFrame f;    
JComboBox cb;
JRadioButton rb ;
JLabel jlselected;
JButton btn;
public uiExample(){    
    f=new JFrame("ComboBox Example");    
    String movies[]={"Scareface","Heat","Carlito's Way","Doggie day Afternoon","Serpico","God Father-II","Johny and Frankie"};        
    cb=new JComboBox(movies);    
    cb.setBounds(50, 50,150,30);   
	rb = new JRadioButton("IMS");
	rb.setBounds(210,100,200,200);
	btn = new JButton("Submit!!!");
	btn.setBounds(10,100,200,200);
	f.add(btn);
	f.add(rb);
    jlselected = new JLabel("Selected Movie");
    jlselected.setBounds(210,50,200,30);
    f.add(cb);  
    f.add(jlselected);      
    f.setLayout(null);    
    f.setSize(450,400);    
    f.setVisible(true); 
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    cb.setMaximumRowCount(2);
    cb.setEditable(true);
    //cb.setSelectedIndex(3);   
    //System.out.println("Selected Index: "+cb.getSelectedItem());
    btn.addActionListener(this);
}
public void actionPerformed(ActionEvent ae){
    String str = "";
	str += "Selected: "+cb.getSelectedItem()+", "+cb.getSelectedIndex();
	if(rb.isSelected()) str += " " +rb.getText();
	jlselected.setText(""+str);
}
public static void main(String[] args) {    
    new uiExample();         
}    
}   