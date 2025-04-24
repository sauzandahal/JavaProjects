import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.*;
import java.awt.event.*;
 
public class TabbedPane extends JFrame {
		JTextField jtf1;
		JTextField jtf2;
		JLabel label1, label2;	
		JLabel output1,output2;
    public TabbedPane() { 
        setTitle("Tabbed Pane");
        JTabbedPane jtp = new JTabbedPane();
        getContentPane().add(jtp);
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
		jp1.setSize(200,200);
        label1 = new JLabel();
        label1.setText("Your Name");
		jtf1 = new JTextField(20);
		jtf2 = new JTextField(20);
		output1 = new JLabel("Name: ");
		output2 = new JLabel("Address: ");
		jtf1.addActionListener(new ac());
		jtf2.addActionListener(new ac());
		
        label2 = new JLabel();
        label2.setText("Your Address");
        jp1.add(label1); jp1.add(jtf1); jp1.add(output1);
        jp2.add(label2); jp2.add(jtf2); jp2.add(output2);
        jtp.addTab("Tab1", jp1);
        jtp.addTab("Tab2", jp2);         
    }
	class ac implements ActionListener{
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == jtf1){
			output1.setText(output1.getText()+jtf1.getText());
		}else{
			output2.setText(output2.getText()+jtf2.getText());
		}
	}
}
    public static void main(String[] args) {       
        TabbedPane tp = new TabbedPane();
        tp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tp.setVisible(true);
        tp.setSize(400,300);
		tp.setLocationRelativeTo(null);
    }
}