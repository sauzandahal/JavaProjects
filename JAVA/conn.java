import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement; 
import java.sql.ResultSet; 
class conn{
Connection c; 
Statement stmt;
public conn(String db) {
	try{  
		   String url = "jdbc:mysql://localhost:3306/"+db;
		   String un = "root";
		   String pw = "";
		   c = DriverManager.getConnection(url,un,pw);
		   System.out.println("Connected!");	
}catch(SQLException ie) {System.out.println(ie.getMessage());}
}
public Connection getConnetion() {
	return c; 
}
public Statement getStatement() {
	try {
		stmt = c.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return stmt;
}
}

class connection extends JFrame implements ActionListener{
	conn c; 
	JTextField jt;
	JButton btn;
	Connection cc; 
	JList list;
	JLabel ljt;
	DefaultListModel lmodel;
	public connection() {
		c = new conn("test");
		cc = c.getConnetion();//getting connection from con object;
		ljt = new JLabel("Enter Product Name:");ljt.setBounds(20,20,150,22);
		jt = new JTextField(14);jt.setBounds(20,50,150,22);
		btn = new JButton("Search!!!");btn.setBounds(20,80,150,22);
		lmodel = new DefaultListModel();
		list = new JList(lmodel);list.setBounds(20,110,150,250);
		setLayout(null);
		setSize(400,500);
		setLocationRelativeTo(null);
		setTitle("Search");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(ljt);
		add(jt);
		add(btn);
		add(list);
		btn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent aeee) {
		String sql = "select * from product where pname= '"+jt.getText()+"'";
		lmodel.clear();
		try{
			Statement stmt = cc.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {				
				lmodel.addElement( "Product: "+ rs.getString(2));
			}
		}catch(SQLException se) {}
}
	public static void main(String[] ar) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new connection();
			}
		});
	}
    
}
