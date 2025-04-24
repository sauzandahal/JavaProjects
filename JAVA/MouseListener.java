import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class mouse_events extends JFrame implements MouseListener{
		public mouse_events(){
		setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Edit - JTable");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,400);
		setVisible(true);
		
		add(btn);
		this.addMouseListener(this);//this references object of mouse_event class
	}
	public void mouseClicked(MouseEvent e){
		btn.setBounds(e.getX(),e.getY(),100,20);
		this.setTitle("Mouse Clicked!!!");
		repaint();
	}
	public void mouseExited(MouseEvent e){}
	public void mouseEntered(MouseEvent e){
		this.setTitle("Mouse Entered!!!");
	}
	public void mouseReleased(MouseEvent e){}
	public void mousePressed(MouseEvent e){
		this.setTitle("Mouse Pressed!!!");
	}
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new mouse_events();
			}
		});
	}
}


/* import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class mouse_events extends JFrame implements MouseListener{
		public mouse_events(){
		setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Edit - JTable");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,400);
		setVisible(true);
		
		add(btn);
		this.addMouseListener(this);//this references object of mouse_event class
	}
	public void mouseClicked(MouseEvent e){
		btn.setBounds(e.getX(),e.getY(),100,20);
		this.setTitle("Mouse Clicked!!!");
		repaint();
	}
	public void mouseExited(MouseEvent e){}
	public void mouseEntered(MouseEvent e){
		this.setTitle("Mouse Entered!!!");
	}
	public void mouseReleased(MouseEvent e){}
	public void mousePressed(MouseEvent e){
		this.setTitle("Mouse Pressed!!!");
	}
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new mouse_events();
			}
		});
	}
}


 */


 /* import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class mouse_signal extends JFrame implements MouseListener{
	JTextField jtf;
	JLabel lbl;
	public mouse_signal(){
		setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Mouse - Event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,400);
		setVisible(true);
		jtf = new JTextField();
		jtf.setBounds(20,20,100,22);
		lbl = new JLabel("Output");
		lbl.setBounds(20,40,100,22);
		add(jtf);
		add(lbl);
		jtf.addMouseListener(this);
		this.addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me){
		if(me.getSource()==jtf)
		jtf.setText("somethings");
		else if(me.getSource()==this)setTitle("I am clicked!!!");
	}	
	public void mousePressed(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseReleased(MouseEvent me){
		lbl.setText(""+jtf.getText());
	}
	public void mouseExited(MouseEvent me){
		lbl.setText("X coord:"+me.getX()+" Y coord:"+me.getY());
		lbl.setBounds(me.getX(),me.getY(),200,22);
	}
	public static void main(String[] mmmouse){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new mouse_signal();
			}
		}) ;
	}
} */

// mouseAdapter
/* import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class abc implements MouseListener{
public void mouseClicked(MouseEvent me){}
public void mouseReleased(MouseEvent me){}
public void mouseEntered(MouseEvent me){}
public void mouseExited(MouseEvent me){}
public void mousePressed(MouseEvent me){}
}

class abc_mouse extends abc{
	JFrame f;
	JButton btn;
	public abc_mouse(){
		f = new JFrame();
		f.setSize(200,300);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		btn = new JButton("Hello Me");
		f.add(btn);
		btn.addMouseListener(this);
	}
	public void mouseEntered(MouseEvent mmmm){
		btn.setText("Mouse AAyyoo");
		f.setSize(400,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBackground(Color.yellow);
	}
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new abc_mouse();
			}
		}) ;
	}
} */




/* import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 	

class mouse_adapter extends MouseAdapter{
	JButton btn;
	JFrame f; 
	public mouse_adapter(){
		f = new JFrame();
		f.setSize(300,300);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Mouse Adapter");
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		btn = new JButton("Mousee");
		f.add(btn);
		btn.addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me){
		btn.setText("Hello Mousee");
	}
	public static void main(String[] aaa){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
			new mouse_adapter();	
			}
		});
	}
} */