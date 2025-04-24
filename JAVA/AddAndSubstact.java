import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Delegation Model: we clicked on button: 
 * but another object did the job of adding or substracting
 */
class mathsss_demo extends JFrame implements ActionListener{
    JLabel n1,n2,ans;
    JTextField jtn1,jtn2;
    JButton btnadd,btnsub;
    public mathsss_demo(){
        n1 = new JLabel("Enter a num");
        n2 = new JLabel("Enter a num");
        ans = new JLabel("");
        ans.setBounds(20,80,150,20);
        jtn1 = new JTextField();
        jtn2 = new JTextField();
        btnadd = new JButton("Add");
        btnsub = new JButton("Sub");
        setLayout(null);//we are not taking any pre-defined setLayout
        n1.setBounds(20,20,150,20);//x,y,width,height
        jtn1.setBounds(180,20,150,20);
        n2.setBounds(20,50,150,20);//x,y,width,height
        jtn2.setBounds(180,50,150,20);
        btnadd.setBounds(180,80,150,20);
        btnsub.setBounds(350,80,150,20);
        btnadd.addActionListener(this);
        btnsub.addActionListener(this);
        add(n1);
        add(n2);
        add(jtn1);
        add(jtn2);
        add(btnadd);
        add(btnsub);
        
        btnsub.setBackground(Color.GREEN);
        setSize(600,300);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        int a = Integer.parseInt(jtn1.getText());
        int b = Integer.parseInt(jtn2.getText());
        if(ae.getSource()==btnadd){
            ans.setText("Sum"+(a+b));
            add(ans);
        }else if(ae.getSource()==btnsub){
            ans.setText("Diff"+(a-b));
            add(ans);
        }
    }
    public static void main(String[] yyy){
        mathsss_demo m = new mathsss_demo();
    }
}