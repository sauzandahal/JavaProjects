import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.Key;
public class KeyExample extends JFrame implements KeyListener {
    JTextField txt;
    JButton btn;
   public KeyExample(){
       txt = new JTextField(20);
       txt.setToolTipText("Enter Character @ or #");
       txt.addKeyListener(this);
	   txt.setBounds(20,20,100,22);
	   btn = new JButton("Check");
       btn.setToolTipText("Click to submit");
	   btn.setBounds(20,50,100,22);
       add(txt);
       add(btn);
       setLayout(null);
       setVisible(true);
	   setTitle("KeyListener");
       setSize(400,400);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   setLocationRelativeTo(null);
   }
   public void keyTyped(KeyEvent e) {      
		String str = txt.getText();
       if(!str.contains("@") && !str.contains("#")){
           JOptionPane.showMessageDialog(this,"This is not @ or #");  
		}else
			JOptionPane.showMessageDialog(this,"Oki Good!!!");  
		btn.setText("TYPED " + e.getKeyChar());
   }
    public void keyPressed(KeyEvent e) {
    
    }
    public void keyReleased(KeyEvent e) {
    
    }
    public static void main(String[] args) {
        new KeyExample();
    }
}
