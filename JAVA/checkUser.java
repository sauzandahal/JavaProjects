import java.awt.*;
import javax.swing.*;

public class checkUser extends JFrame {
    private JTextField nameField;
    private JRadioButton maleButton;
    private JRadioButton femaleButton;
    private JCheckBox movieBox;
    private JCheckBox fightBox;
    private JComboBox<String> districtBox;
    private JButton commentButton;
    private JButton submitButton;

    public checkUser() {
        // Set the title and layout of the frame
        super("User Interface");
        setLayout(new FlowLayout());

        // Create the components
        nameField = new JTextField("Name", 10);
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        movieBox = new JCheckBox("Movie");
        fightBox = new JCheckBox("Fight");
        String[] districts = {"District 1", "District 2", "District 3"};
        districtBox = new JComboBox<>(districts);
        commentButton = new JButton("Comment");
        submitButton = new JButton("Submit");

        // Add the components to the frame
        add(nameField);
        add(maleButton);
        add(femaleButton);
        add(movieBox);
        add(fightBox);
        add(districtBox);
        add(commentButton);
        add(submitButton);

        // Set the size and location of the frame
        setSize(300, 200);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        checkUser ui = new checkUser();
        ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ui.setVisible(true);
    }
}


