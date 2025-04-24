import java.sql.*;
public class test_connection {
	public static void main(String[] ar){
		try{  
			   //String url = "jdbc:mysql://localhost:3306/test";
			   //String un = "root";
			   //String pw = "";
Connection c = DriverManager.getConnection("jdbc:mysql://localhost/test?user=root&password=");
			   //Connection c = DriverManager.getConnection(url,un,pw);
			System.out.println("Connected!");
			   Statement st=(Statement) c.createStatement();  
			   
			   ResultSet rs=st.executeQuery("select pname,qty from product");  
			    
			   while(rs.next()){  
			    System.out.println(rs.getString(2)+" "+rs.getString(3));  
			   } 
			  
			}  
			catch(SQLException ee){System.out.println(ee.getMessage());}
	}
}

// Inserting data to the database 

// import javax.swing.*;
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.Statement;
// import java.awt.*;
// import java.awt.event.*;

// class Test extends JFrame implements ActionListener{
// 	JTextField jt1,jt2,jt3;
// 	JButton btn;
// 	public Test() {
// 		setLayout(new FlowLayout());
// 		setSize(200,300);
// 		setTitle("In Eclipse");
// 		setVisible(true);
// 		jt1 = new JTextField(10);
// 		jt2 = new JTextField(10);
// 		jt3 = new JTextField(10);
// 		add(jt1);add(jt2);add(jt3);
// 		btn = new JButton("Insert");
// 		add(btn);
// 		btn.addActionListener(this);
// 	}
	
// 	public void actionPerformed(ActionEvent aeeeee) {
// 		try{  
// 			   String url = "jdbc:mysql://localhost:3306/test";
// 			   String un = "root";
// 			   String pw = "";
// 			   Connection c = DriverManager.getConnection(url,un,pw);
// 				   System.out.println("Connected!");
			
// 			   Statement st=(Statement) c.createStatement();  
			    
// 			    int id = Integer.parseInt(jt1.getText());
// 			    String pname = jt2.getText();
// 			    int qty = Integer.parseInt(jt3.getText());
			    
// 	st.executeUpdate("insert into product values ("+id+",'"+pname+"',"+qty+")");
// 			}  
// 			catch(Exception ee){System.out.println(ee.getMessage());}	
// 	}
// 	public static void main(String[] ar){
// 		new Test();
// 	}
// }