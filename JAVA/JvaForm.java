/* import javax.swing.*;

public class JvaForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        // Name field
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(10, 10, 100, 30);
        JTextField nameField = new JTextField();
        nameField.setBounds(120, 10, 200, 30);
        frame.add(nameLabel);
        frame.add(nameField);

        // Mobile field
        JLabel mobileLabel = new JLabel("Mobile:");
        mobileLabel.setBounds(10, 50, 100, 30);
        JTextField mobileField = new JTextField();
        mobileField.setBounds(120, 50, 200, 30);
        frame.add(mobileLabel);
        frame.add(mobileField);

        // Gender field
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(10, 90, 100, 30);
        JRadioButton maleButton = new JRadioButton("M");
        maleButton.setBounds(120, 90, 50, 30);
        JRadioButton femaleButton = new JRadioButton("F");
        femaleButton.setBounds(170, 90, 50, 30);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        frame.add(genderLabel);
        frame.add(maleButton);
        frame.add(femaleButton);

        // Country field
        JLabel countryLabel = new JLabel("Country:");
        countryLabel.setBounds(10, 130, 100, 30);
        String[] countries = {"Nepal", "India", "China", "Bhutan"};
        JComboBox<String> countryBox = new JComboBox<>(countries);
        countryBox.setBounds(120, 130, 200, 30);
        frame.add(countryLabel);
        frame.add(countryBox);

        // Submit button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(120, 170, 100, 30);
        frame.add(submitButton);

        frame.setVisible(true);
    }
}
 */

 import javax.swing.*;
// import java.awt.*;

import javax.swing.*;
import java.awt.*;

class Form1{
    JFrame j;
    JLabel b,b1;
    JRadioButton r1,r2;
    JComboBox cb;
    JButton bb;
    ButtonGroup gb;

    public Form1(){
        j = new JFrame();
        j.setSize(200,200);
        j.setLayout(new FlowLayout());

        b = new JLabel("Gender");
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        gb = new ButtonGroup();
        j.add(b);
        j.add(r1);
        j.add(r2);
        gb.add(r1);
        gb.add(r2);

        b1 = new JLabel("Country"); j.add(b1);
        String [] s= { "Nepal","India","China","Bhutan"};
        JComboBox<String> cb= new JComboBox<>(s);j.add(cb);

        bb = new JButton("Submit");
        
        
       
      
        j.add(bb);

        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class JvaForm{
    public static void main(String[] args){
        new Form1();
    }
}
