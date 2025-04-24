


import javax.swing.*;
import java.awt.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // Create panel with grid layout
        JPanel panel = new JPanel(new GridLayout(4, 4));

        // Create buttons
        String[] buttons = {
            "1", "2", "3", "+",
            "4", "5", "6", "-",
            "7", "8", "9", "*",
            ".", "0", "=", "/"
        };

        // Add buttons to panel
        for (String text : buttons) {
            panel.add(new JButton(text));
        }

        // Add panel to frame
        frame.getContentPane().add(panel);

        // Display the frame
        frame.pack();
        frame.setVisible(true);
    }
}



/* import javax.swing.*;
 * import java.awt.*;
 * 
 * 
 * public class Calculator{
 * public static void main(string[] args){
 * JFrame f = new JFrame("this is a calculator");
 * f.setSize(200,200);
 * f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 * f.setVisible(true);
 * 
 * JPanal p = new JPanal(new GridLayout(4,4));
 * 
 * String [] s = {
 * "1","2","3","4",
 * "5","6","7","8",
 * "9","0","+","-",
 * "*","/",".","="
 * 
 * };
 * 
 * for(String t:b){
 * p.add(new JButton(t));
 * }
 * f.addContentPane().add(p);
 * f.pack();
 * }
 * }
 */



//Responsive

 /* import javax.swing.*;
import java.awt.*;

public class SimpleCalculator {
    private JFrame frame;
    private JPanel panel;
    private JTextField textField;
    private JButton[] numberButtons = new JButton[10];
    private JButton addButton, subButton, mulButton, divButton;
    private JButton decButton, equButton, delButton, clrButton, negButton;
    private Font myFont = new Font("Ink Free", Font.BOLD, 30);

    public SimpleCalculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);
        textField.setEditable(false);

        // Initialize number buttons
        for(int i =0;i<10;i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        // Initialize function Buttons
        negButton = new JButton("+/-");
        negButton.setFont(myFont);
        negButton.setFocusable(false);

        decButton = new JButton(".");
        decButton.setFont(myFont);
        decButton.setFocusable(false);

        equButton = new JButton("=");
        equButton.setFont(myFont);
        equButton.setFocusable(false);

        delButton = new JButton("Delete");
        delButton.setFont(myFont);
        delButton.setFocusable(false);

        clrButton = new JButton("Clear");
        clrButton.setFont(myFont);
        clrButton.setFocusable(false);

        addButton = new JButton("+");
        addButton.setFont(myFont);
        addButton.setFocusable(false);

        subButton = new JButton("-");
        subButton.setFont(myFont);
        subButton.setFocusable(false);

        mulButton = new JButton("*");
        mulButton.setFont(myFont);
        mulButton.setFocusable(false);

        divButton = new JButton("/");
        divButton.setFont(myFont);
        divButton.setFocusable(false);

        
       // Add buttons to panel
       panel = new JPanel();
       panel.setBounds(50, 100, 300, 300);
       panel.setLayout(new GridLayout(4,4,10,10));
       
       // Add buttons to the panel
       panel.add(numberButtons[1]);
       panel.add(numberButtons[2]);
       panel.add(numberButtons[3]);
       panel.add(addButton);
       panel.add(numberButtons[4]);
       panel.add(numberButtons[5]);
       panel.add(numberButtons[6]);
       panel.add(subButton);
       panel.add(numberButtons[7]);
       panel.add(numberButtons[8]);
       panel.add(numberButtons[9]);
       panel.add(mulButton);
       panel.add(decButton);
       panel.add(numberButtons[0]);
       panel.add(equButton);
       panel.add(divButton);

       // Add textfield and panel to frame
       frame.add(panel);
       frame.add(textField);
       
       frame.setVisible(true);
    }

    public static void main(String[] args) {
         SimpleCalculator calc = new SimpleCalculator();
    }
} */