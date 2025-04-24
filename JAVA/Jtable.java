// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.*;
// import javax.swing.table.*;

// public class Jtable extends JFrame {
//     JTable jt;
//     JScrollPane jsp;
//     String[] headings = {"Name", "Address"};
//     Object[][] records = {{"Ram", "Ktm"}, {"shyam", "Ktm"}, {"Rambo", "Brt"}};

//     public Jtable() {
//         jt = new JTable(records, headings);
//         jsp = new JScrollPane(jt);
//         jsp.setBounds(20, 20, 200, 100);
//         setLayout(null);
//         setSize(300, 200);
//         setVisible(true);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLocationRelativeTo(null);
//         add(jsp);
//     }

//     public static void main(String[] args) {
//         Jtable jd = new Jtable();
//     }
// }

// Adding records to table from data taken from user. This program consists of two textfields, one button and a JTable. As user provides data in the textfields and clicks button, that record is added to the jtable.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
class jtable_demo_event extends JFrame{
	JTable jt;
	JScrollPane jsp;
	DefaultTableModel dtm;
	JLabel lname,laddress;
	JTextField tname,taddress;
	JButton btn;
	String [] headings = {"Name","Address"};
	public jtable_demo_event(){
		lname = new JLabel("Name");
		lname.setBounds(20,20,150,22);
		tname = new JTextField(10);
		tname.setBounds(20,45,150,22);
		laddress = new JLabel("Address");
		laddress.setBounds(180,20,150,22);
		taddress = new JTextField(10);
		taddress.setBounds(180,45,150,22);
		btn = new JButton("Add");
		btn.setBounds(180,70,100,22);
		add(lname);add(tname);
		add(laddress);add(taddress);
		add(btn);
		dtm = new DefaultTableModel();
		dtm.addColumn("Name");
		dtm.addColumn("Address");
		jt = new JTable(dtm);
		dtm.insertRow(0,new Object[]{"Sitee","Ktm"});
		dtm.insertRow(0,new Object[]{"Ravane","Ktm"});
		dtm.insertRow(0,new Object[]{"Sheetal","Baneshwor"});
		//jt.setBounds(20,20,100,100);
		jsp = new JScrollPane(jt);
		jsp.setBounds(20,100,200,100);
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				Object rec[][]={{tname.getText(),taddress.getText()}};
				//dtm.addRow(rec[0]); inserts row at the end 
				dtm.insertRow(0,rec[0]); //inserts row at the begining
			}
		});
		setLayout(null);
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		add(jsp);
	}
	public static void main(String[] aarr){
		jtable_demo_event jd = new jtable_demo_event();
	}
}
