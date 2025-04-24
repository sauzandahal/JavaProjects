import java.awt.*;
import java.awt.event.*;
import javax.lang.model.util.ElementKindVisitor6;
import javax.swing.*;
class abcGrid extends JFrame implements ActionListener{
    JLabel name;
    JButton btn1,btn2,btn3;
    JTextField tname;
    public abcGrid(){
        name = new JLabel("Enter Name");
        tname = new JTextField(20);
        btn1 = new JButton("East");
        btn2 = new JButton("West");
        btn3 = new JButton("Center");
        //Layout manager: specifies how the components are arranged on the container
        add(name);
        add(tname);
        add(btn1);
        add(btn2);
        add(btn3);
        btn3.addActionListener(this);
        setLayout(new GridLayout(3,2));//changing default layout to Gridlayout
        //we have to specify number of rows and columns (it is in tabular format)
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public void actionPerformed(ActionEvent aeee){
        if(tname.getText().length()>0)
        {
            int a = Integer.parseInt(tname.getText());
            if(a > 33){
                btn1.setText("Number is greater than 33");
            }else{
                btn2.setText("Number is not greater than 33");
            }
        }
    }
    public static void main(String[] args){
     abcGrid a = new abcGrid();  
    }
}
