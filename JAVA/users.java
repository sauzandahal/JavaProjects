import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class users{
	String name,pwd;
	public users() {
		
	}
	public void  set(String name,String pwd) {
		this.name = name;
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return pwd;
	}
}
public class log_reg extends JFrame implements ActionListener {
	ArrayList u = new ArrayList();
	users uu; 
	JPanel p1, p2;
	JButton btn1,btn2,btnLog,btnReg,btnshowusers;
	JTextField tname, tpwd;
	JTextField rtname,rtpwd,rertpwd;
	JList list; 
	DefaultListModel dlm;
	public log_reg() {
		uu = new users();
		btn1 = new JButton("Login");btn1.setBounds(20,20,100,22);
		btn2 = new JButton("Register");btn2.setBounds(20,45,100,22);
		btnshowusers = new JButton("Show Users");btnshowusers.setBounds(20,70,100,22);
		
		dlm = new DefaultListModel();
		list = new JList(dlm);list.setBounds(130,20,200,300);
		p1 = new JPanel();p1.setBounds(130,20,300,300);
		p1.setLayout(null);
		tname = new JTextField(10);tname.setBounds(20,20,100,22);
		tpwd = new JTextField(10);tpwd.setBounds(20,45,200,22);
		btnLog = new JButton("Login");btnLog.setBounds(20,70,200,22);
		p1.setBackground(Color.BLUE);
		p1.add(tname);
		p1.add(tpwd);
		p1.add(btnLog);
		p1.setVisible(false);
		
		p2 = new JPanel();p2.setBounds(130,20,300,300);
		p2.setBackground(Color.CYAN);
		rtname = new JTextField(10);rtname.setBounds(20,20,100,22);
		rtpwd = new JTextField(10);rtpwd.setBounds(20,45,200,22);
		rertpwd = new JTextField(10);rertpwd.setBounds(20,70,200,22);
		btnReg = new JButton("Register");btnReg.setBounds(20,95,200,22);
		p2.setVisible(false);
		p2.setLayout(null);
		p2.add(rtname);
		p2.add(rtpwd);
		p2.add(rertpwd);
		p2.add(btnReg);
		
		
		setLayout(null);
		setVisible(true);
		setSize(500,400);
		add(btn1);
		add(btn2);
		add(btnshowusers);
		add(p1);//login form
		add(p2);//registration form
		add(list);
		list.setVisible(false);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btnshowusers.addActionListener(this);
		btnLog.addActionListener(this);
		btnReg.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btn1) {
			p1.setVisible(true);
			p2.setVisible(false);
			list.setVisible(false);
		}else if(ae.getSource()==btn2) {
			p1.setVisible(false);
			p2.setVisible(true);
			list.setVisible(false);
		}else if(ae.getSource()==btnshowusers) {
			dlm.clear();
			for(int i=0;i<u.size();i++) {
				dlm.addElement(u.get(i).getName());
				System.out.println("Name: "+u.get(i).getName());
				list.setVisible(true);
				p1.setVisible(false);
				p2.setVisible(false);
				
			}
		}else if(ae.getSource()==btnReg) {
			uu = new users();
			uu.set(rtname.getText(),rtpwd.getText());
			u.add(uu);
			rtname.setText("");rtpwd.setText("");rertpwd.setText("");
		}else if(ae.getSource()== btnLog) {
			for(int i=0;i<u.size();i++) {
				if(u.get(i).getName().equals(tname.getText()) && u.get(i).getPassword().equals(tpwd.getText())) {
					btnLog.setText("WelCome !!!");
					btnLog.setBackground(Color.RED);
					break; 
				}else {
					btnLog.setText("Not WelCome !!!");
					btnLog.setBackground(Color.yellow);
				}
			
			}
		}
	}
	public static void main(String[] owl) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new log_reg();
			}
		});
	}
}


