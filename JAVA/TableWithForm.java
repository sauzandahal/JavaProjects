// import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
class jtable_demo_event extends JFrame{
	JTable jt;
	JScrollPane jsp;
	DefaultTableModel dtm;
	JLabel lname;
	JTextField name;
	JButton btn;
	String [] headings = {"sno","Name","Mobile"};
	public jtable_demo_event(){
		lname = new JLabel("Enter Name");
		lname.setBounds(112,45,150,22);
		name = new JTextField(10);
		name.setBounds(180,45,150,22);
		
		
		btn = new JButton("Search");
		btn.setBounds(180,70,100,22);
		add(lname);add(name);
		
		add(btn);
		dtm = new DefaultTableModel();
		dtm.addColumn("S.NO");
		dtm.addColumn("Name");
        dtm.addColumn("Mobile");
		jt = new JTable(dtm);
		dtm.insertRow(0,new Object[]{null,null,null});
		dtm.insertRow(1,new Object[]{null,null,null});
		dtm.insertRow(2,new Object[]{null,null,null});
		//jt.setBounds(20,20,100,100);
		jsp = new JScrollPane(jt);
		jsp.setBounds(20,100,200,100);
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				Object rec[][]={{name.getText()}};
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
		 new jtable_demo_event();
	}
}
