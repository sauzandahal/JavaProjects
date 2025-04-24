/* package connectmysql;
import javax.swing.*;
import javax.swing.table.;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
class bill_ui extends JFrame implements ActionListener{
JLabel lblid,lblpname,lblqty,lbltotal;
JTextField tid,tpname,tqty;
JButton btnadd;
JTable table;
DefaultTableModel dtm;
JScrollPane jsp;
JButton btnsubmit; 
int total=0,grandtotal=0;
public bill_ui() {
	setLayout(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(500,600);
	setTitle("Bill App");
	setVisible(true);
	setLocationRelativeTo(null);
	lblid = new JLabel("Id");lblid.setBounds(20,20,100,22);
	tid = new JTextField(10);tid.setBounds(130,20,100,22);
	lblpname = new JLabel("P Name");lblpname.setBounds(20,46,100,22);
	tpname = new JTextField(10);tpname.setBounds(130,46,100,22);
	lblqty = new JLabel("Quantity");lblqty.setBounds(20,72,100,22);
	tqty = new JTextField(10);tqty.setBounds(130,72,100,22);
	lbltotal = new JLabel("Total: ");lbltotal.setBounds(100,98,110,22);
	btnadd = new JButton("Add Product");btnadd.setBounds(240,98,100,22);
	dtm = new DefaultTableModel();
	dtm.addColumn("Pid");
	dtm.addColumn("Product Name");
	dtm.addColumn("Quantity");
	table = new JTable(dtm);
	jsp = new JScrollPane(table);
	jsp.setBounds(20,124,300,270);
	btnsubmit = new JButton("Submit");btnsubmit.setBounds(130,410,100,22);
	add(lblid);add(tid);
	add(lblpname);add(tpname);
	add(lblqty);add(tqty);
	add(lbltotal);
	add(btnadd);
	add(jsp);
	add(btnsubmit);
	
	btnadd.addActionListener(this);
	btnsubmit.addActionListener(this);
}
public void actionPerformed(ActionEvent ae) {
	if(ae.getSource()==btnadd) {
		int pid= Integer.parseInt(tid.getText());
		String pname = tpname.getText();
		int qty = Integer.parseInt(tqty.getText());
		Object[] r = {pid,pname,qty};
		total = qty10;
		grandtotal+=total;
		lbltotal.setText("Total: "+grandtotal);
		dtm.addRow(r);
		tid.setText("");
		tpname.setText("");
		tqty.setText("");
	}else if(ae.getSource()==btnsubmit) {
		String url = "jdbc:mysql://localhost:3306/test";
		   String un = "root";
		   String pw = "";
		   try {
			   Connection c = DriverManager.getConnection(url,un,pw);
			   System.out.println("Connected!");
			   Statement st = c.createStatement(
				         ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			   for(int i=0;i<dtm.getRowCount();i++) {
					String sql="insert into product values(";
					sql += dtm.getValueAt(i, 0)+",'";
					sql += dtm.getValueAt(i, 1)+"',";
					sql += dtm.getValueAt(i, 2)+")";
					st.addBatch(sql);
					System.out.println(sql);
			   }
			   st.executeBatch();
			   JOptionPane.showMessageDialog(this,"Transaction Successful!!."); 
		   }catch(SQLException se) {System.out.println(se.getMessage());}
		}
	}
public static void main(String[] opp) {
	SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			new bill_ui();		
		}
	});
}
}
 */